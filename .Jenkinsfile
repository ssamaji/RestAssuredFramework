pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from version control
                checkout scm
            }
        }

        stage('Build') {
            steps {
                cleanWs()
                script {
                 echo 'master build creation in progress'
                    // Example for Maven build
                   sh 'echo "Current Directory: ${PWD}"'
                   sh 'ls -la'
                   sh '/Users/swatisamaji/.jenkins/workspace/CI_CD_Pipeline/RestAssuredFramework/./gradlew build'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                 echo 'Running the tests'
                    // Example for running tests
                   sh './gradlew test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Example for deploying to a server
//                   sh './deploy_script.sh'
                    echo 'Deploying the build to production'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded! Triggering notifications...'
            // Add notification steps here
        }
        failure {
            echo 'Pipeline failed! Triggering notifications...'
            // Add notification steps here
        }
    }
}
