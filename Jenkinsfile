  pipeline {
    agent any

    tools {
    // Use the Maven and JDK versions installed in Jenkins
    maven 'Maven3'
    jdk 'JDK17'
    }

    stages {
    stage('Checkout') {
    steps {
    echo 'Checking out code...'
    checkout scm
    }
    }
    
    stage('Build') {
    steps {
    echo 'Building Spring Boot application...'
    sh 'mvn clean package -DskipTests'
    }
    }
    
    stage('Test') {
    steps {
    echo 'Running tests...'
    sh 'mvn test'
    }
    }
    
    stage('Package') {
    steps {
    echo 'Packaging application...'
    sh 'mvn package'
    }
    }
    
    stage('Run') {
    steps {
    echo 'Optionally running the application...'
    // You can comment out if you don't want to run it
    sh 'java -jar target/*.jar &'
    }
    }
    }

    post {
    success {
    echo '✅ Build and tests succeeded!'
    }
    failure {
    echo '❌ Build or tests failed!'
    }
    }
  }
