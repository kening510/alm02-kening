pipeline {
    agent any
    parameters{
        choice(name: 'DEPLOY_ENV', choices:['int','stage','prod'],description:'Target environment')
    }
    stages {
        stage('Build application') {
            steps {
                sh 'mvn clean install'
            }
            post{
                always{
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

         stage('deploy war files') {
            steps {
                sh 'ls'
            }
        }
        
    }
}

