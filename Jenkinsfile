#!groovy

pipeline {
    agent any
    stages {
        stage ('Build') {
            steps{
                script{
                    if (env.BRANCH_NAME == 'master' || env.BRANCH_NAME.startsWith('release-')) {
                        def server = Artifactory.server "artifactory" // Artifactory server ID from Jenkins configuration
                        def rtMaven = Artifactory.newMavenBuild()
                        def buildInfo = Artifactory.newBuildInfo()

                        rtMaven.tool = "maven" // Tool name from Jenkins configuration
                        rtMaven.deployer releaseRepo:'asteriosoft-release-local', snapshotRepo:'asteriosoft-snapshot-local', server: server
                        rtMaven.resolver releaseRepo:'asteriosoft-release', snapshotRepo:'asteriosoft-snapshot', server: server

                        buildInfo = rtMaven.run pom: 'pom.xml', goals: 'clean install -P dev -Dbuild.version=' +
                                env.BRANCH_NAME + "." + env.BUILD_ID + (env.BRANCH_NAME == 'master' ? '-SNAPSHOT' : '')

                        buildInfo.retention maxBuilds: 10, maxDays: 7, deleteBuildArtifacts: true

                        rtMaven.deployer.deployArtifacts buildInfo
                        server.publishBuildInfo buildInfo
                    } else {
                        sh 'mvn clean package'
                    }
                }
            }
        }
    }
}
