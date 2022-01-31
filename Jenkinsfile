pipeline {

    agent any

    stages {

        stage("build") {

            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }

            steps {
                echo "Building version ${NEW_VERSION}"
                bat "mvn clean install"
            }

        }

        stage("test") {

            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }

             steps {
                echo "Testing the application"
                bat 'mvn test'
             }

        }

        stage("deploy") {

            steps {
                echo "Deploying with ${SERVER_CREDENTIALS}"
            }

        }

    }

    post {
        always {
            junit "**/target/surefire-reports/TEST-*.xml"
        }
    }

}