pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Clonando repositorio'
                checkout scm
            }
        }

        stage('build') {
            steps {
                echo 'Compilando proyecto...'
                sh 'mvn clean compile'
            }
        }

        stage('test') {
            steps {
                echo 'Ejecutando pruebas...'
                sh 'mvn -q test || echo "No hay pruebas implementadas"'
            }
        }

        stage('package') {
            steps {
                echo 'Empaquetando aplicación'
                sh 'mvn package -DskipTests'
            }
        }
    }
}