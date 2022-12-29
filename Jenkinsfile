pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage('git repo & clean') {
            steps {
                bat "rmdir  /s /q Azure-SpringBoot"
                bat "git clone https://github.com/Muskan261Gupta/Azure-SpringBoot.git"
                bat "mvn clean -f Azure-SpringBoot"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f Azure-SpringBoot"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f Azure-SpringBoot"
            }
        }
    }
}
    
