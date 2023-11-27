pipeline {
    agent any

    environment {
        DEMO='1.3'
    }

    stages {
        stage('stage-1') {
            steps {
                echo "this is build ${BUILD_NUMBER} of demo ${DEMO}"
                sh '''
                    echo "this is a multi-line script"
                    chmod +x ./test.sh
                    ./test.sh
                '''
            }
        }
    }
}
