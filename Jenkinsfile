pipeline {
		// agent any
		agent { 
			docker { 
				image 'maven:3.8.1-adoptopenjdk-11'
				reuseNode true
			} 
		}
		stages {
			stage('Build') {
				steps {
					sh 'mvn --version'
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
