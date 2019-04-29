pipeline {
    agent {
        docker {
            image 'maven:alpine'
            args '-v /usr/local/.m2:/usr/local/.m2'
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