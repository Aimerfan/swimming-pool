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
    }
}
