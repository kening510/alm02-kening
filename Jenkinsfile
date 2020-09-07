pipeline {
    agent any
    parameters{
        choice(name: 'DEPLOY_ENV', choices:['int','stage','prod'],description:'Target environment')
    }
    stages {
        stage('Build application') {
            agent {
                docker {
                    image 'maven:3.6.3-slim'
                }
            }
            steps {
                sh 'mvn package'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                    sh 'mvn surefire-report:report-only'
                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/', reportFiles: 'surefire-report.html', reportName: 'Unit tests', reportTitles: 'Unit tests'])
                    publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/jacoco/', reportFiles: 'index.html', reportName: 'Test coverage', reportTitles: 'Test coverage'])
                }
                
                success {
                   archiveArtifacts  'target/tellmyfuture-0.0.1-SNAPSHOT.jar'
                }
            }
        }

         stage('deploy application') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
        
    }
}

