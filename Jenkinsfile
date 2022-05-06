pipeline {
		// agent any
		agent { 
			docker { 
				image 'maven:3.8.5-jdk-11'
			} 
		}
		stages {
			stage('Build') {
				steps {
					shell 'mvn --version'
					echo "Build"
				}
			}
			stage('Test') {
				steps {
					echo "Test"
				}
			}
			stage('BIntegration Testuild') {
				steps {
					echo "Integration Test"
				}
			}
		} 
		
		post {
			always {
				echo 'Im awesome. I run always'
			}
			success {
				echo 'I run when you are successful'
			}
			failure {
				echo 'I run when you fail'
			}
		}
}
