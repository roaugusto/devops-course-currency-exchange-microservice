pipeline {
		// agent any
		agent { 
			docker { 
				image 'node:13.8'
				args '-u root'
			} 
		}
		stages {
			stage('Build') {
				steps {
					sh 'node --version'
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
