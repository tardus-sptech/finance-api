node{
  stage('SCM checkout'){
    git 'https://github.com/tardus-sptech/finance-api'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
