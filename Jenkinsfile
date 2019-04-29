pipeline {
    agent {
        docker {
            image 'maven:alpine'
            args '-v /tmp/.m2:/tmp/.m2'
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