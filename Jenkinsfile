pipeline {
    agent any
    parameters{
        choice(name: 'DEPLOY_ENV', choices:['int','stage','prod'],description:'Target environment')
    }
    stages {
        stage('Fetch code') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('build code1234') {
            steps {
                sh 'ls'
            }
        }
        stage('run test and publish test results') {
            steps {
                sh 'ls'
            }
        }
        
         stage('deploy war files') {
            steps {
                sh 'ls'
            }
        }
        
    }
}
