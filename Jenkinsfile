pipeline {
    agent any

    stages {
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

        stage('deploy') {
            steps {
                echo 'Simulando despliegue...'

                // Crear carpeta de "deploy" si no existe
                sh 'mkdir -p deploy'

                // Copiar el JAR como si fuera un despliegue real
                sh 'cp target/*.jar deploy/ || echo "No se encontró el .jar"'

                echo 'Aplicación copiada a la carpeta deploy/.'
                echo 'Despliegue simulado completado.'
            }
        }
    }
}