pipeline {

    agent any

    stages {

        stage("build") {

            steps {
                echo "Building..."
                bat "mvn clean package"
            }

        }

        stage("test") {

             steps {
                echo "Testing the application"
                bat 'mvn test'
             }

        }

        stage("deploy") {

            steps {
                echo "Deploying ..."
            }

        }

    }

    post {
        always {
            junit "**/target/surefire-reports/TEST-*.xml"
        }
    }

}