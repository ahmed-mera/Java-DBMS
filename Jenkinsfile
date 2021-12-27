pipeline {
  agent any
  stages {
    stage('SCM checkout') {
      steps {
        git 'https://github.com/ahmed-mera/Java-DBMS.git'
      }
    }

    stage('Build') {
      steps {
        tool(name: 'maven', type: 'maven')
      }
    }

  }
}