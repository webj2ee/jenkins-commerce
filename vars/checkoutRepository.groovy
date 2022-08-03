def call(commerceDir, branch, projectRepository) {
    urlPrefix = "https://"
    echo "##### Checkout repository started #####"
    withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'githubCodeRepoCredentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {        
        repoDomainPart = projectRepository.substring(urlPrefix.size())
        echo " repository path ---------- ${repoDomainPart}"
        repository = "https://$USERNAME:$PASSWORD@" + repoDomainPart
        echo "##### Checkout repository #####"
        bat """cd ${commerceDir} && git clone ${repository} . && git fetch --all && git checkout origin/${branch}"""
    }
}
