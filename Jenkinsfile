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
                    sh 'ls'
                    //junit 'target/surefire-reports/*.xml'
                    //publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/surefire-reports/', reportFiles: 'index.html', reportName: 'Unit tests', reportTitles: 'Unit tests'])
                    //publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'target/site/jacoco/', reportFiles: 'index.html', reportName: 'Test coverage', reportTitles: 'Test coverage'])
                }
                
                success {
                    archive 'target/tellmyfuture-0.0.1-SNAPSHOT.jar'
                }
            }
        }

         stage('deploy war files') {
            steps {
                sh 'asadmin --port 4848 deploy --force --name tellmyfuture-${DEPLOY_ENV} --contextroot tellmyfuture-${DEPLOY_ENV} target/tellmyfuture-0.0.1-SNAPSHOT.jar'
            }
        }
        
    }
}

