pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh "mvn -DskipTests clean package"
            }
        }
        stage("Docker build") {
            steps {
                sh 'docker version'
                sh 'docker build -t bold-lama .'
                sh 'docker image list'
                sh 'docker tag bold-lama ebullq/bold-lama:bold-lama'
            }
        }
        stage("Docker Login") {
            steps {
                withCredentials([string(credentialsId: 'DOCKER_HUB_PASSWORD', variable: 'PASSWORD')]) {
                    sh 'docker login -u ebullq -p $PASSWORD'
                }
            }
        }
        stage("Push Image to Docker Hub") {
             steps {
                sh 'docker push ebullq/bold-lama:bold-lama'
             }
        }

    }
}