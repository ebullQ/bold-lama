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
        stage("Docker build") {
                sh 'docker version'
                sh 'docker build -t jhooq-docker-demo .'
                sh 'docker image list'
                sh 'docker tag jhooq-docker-demo rahulwagh17/jhooq-docker-demo:jhooq-docker-demo'
        }
        stage("Docker Login") {
                withCredentials([string(credentialsId: 'DOCKER_HUB_PASSWORD', variable: 'PASSWORD')]) {
                    sh 'docker login -u ebullq -p $PASSWORD'
                }
        }
        stage("Push Image to Docker Hub") {
                sh 'docker push ebullq/bold-lama:bold-lama'
        }

    }
}