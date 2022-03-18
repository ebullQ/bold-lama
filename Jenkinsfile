pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -DskipTests clean package"
            }
        }
        stage('Testing') {
            steps {
                sh "mvn test"
            }
        }
    }
}