CODE_CHANGES = getGitChanges()

pipeline {

    agent any

    environment {
        NEW_VERSION = '1.1.0'
        SERVER_CREDENTIALS = credentials('123456789')
    }

    stages {

        stage("build") {

            when {
                expression {
                    BRANCH_NAME == 'dev' && CODE_CHANGES == true
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