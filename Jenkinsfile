pipeline {
    agent {
        docker {
            image 'maven:alpine'
            args '-v ~/.m2:~/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}