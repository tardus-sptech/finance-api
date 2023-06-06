node{
  stage('SCM checkout'){
    git 'https://github.com/tardus-sptech/finance-api'
  }
  stage('Compile-Package'){
    def mvnHome = tool name: 'maven', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
