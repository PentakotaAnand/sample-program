pipeline {
  agent any
  stages {
    stage('Build and Test') {
      steps {
        bat(script: 'bat \'ant build\'', returnStatus: true)
      }
    }
  }
  environment {
    stage = 'test'
  }
}