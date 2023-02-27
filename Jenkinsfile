pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', 
                jdk: 'openjdk-java11', 
                maven: 'maven3', 
                mavenSettingsConfig: '--- Use system default settings or file path ---') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('test') {
            steps {
                withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', 
                jdk: 'openjdk-java11', 
                maven: 'maven3', 
                mavenSettingsConfig: '--- Use system default settings or file path ---') {
                    sh 'mvn clean install'
                }
            }
        }
    }
}
