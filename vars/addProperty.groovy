def call(commerceDir, property){
    bat("echo '${property}' >> ${commerceDir}/hybris/config/local.properties")
}
