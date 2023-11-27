pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo "The build number is: ${BUILD_NUMBER}"
            }
        }
    }
}