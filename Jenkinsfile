pipeline {
  agent any
  stages {
    stage('Stages') {
      parallel {
        stage('SCM checkout') {
          steps {
            git(url: 'https://github.com/ahmed-mera/Java-DBMS.git', branch: 'master')
          }
        }

        stage('Build') {
          steps {
            sh 'mvn clean package -DskipTests'
          }
        }

        stage('') {
          steps {
            sh 'java -jar $WORKSPACE/'
          }
        }

      }
    }

  }
}