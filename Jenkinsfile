pipeline {
		agent any
		stages {
			stage('Build') {
				agent { 
					docker { 
						image 'maven:3.6.3' 
					} 
				}
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
