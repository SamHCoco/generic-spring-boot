pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                withMaven(
                jdk: 'openjdk-java11', 
                maven: 'maven3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('test') {
            steps {
                withMaven( 
                jdk: 'openjdk-java11', 
                maven: 'maven3') {
                    sh 'mvn clean install'
                }
            }
        }
    }
}
