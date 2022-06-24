pipeline {
    agent any
    stages {
        stage('run-test') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
                jacoco(
                    classPattern: 'app/build/classes',
                    inclusionPattern: '**/*.class',
                    exclusionPattern: '**/*Test*.class',
                    execPattern: 'app/build/jacoco/**/*.exec'
            	   )
            }
        }
        stage('sonarqube-analysis') {
            environment {
                SONAR_TOKEN = credentials('sonarqube-token')
            }
            steps {
                sh '''./gradlew sonarqube \
                    -Dsonar.projectKey=swimming-pool \
                    -Dsonar.host.url=http://140.134.26.62:20090 \
                    -Dsonar.login=$SONAR_TOKEN
                '''
            }
        }
    }
}
