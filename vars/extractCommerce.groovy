def call(commerceDir) {
    echo "##### Extract commerce platform ##### -- ${commerceDir}"
    //sh "unzip -o ../CXCOM2005*.ZIP -d ${commerceDir}/core-customize"
    /** Uncomment if you will be using the Integration Extension Pack
    echo "##### Extract commerce integration pack #####"
    //sh "unzip -o ../CXCOMINTPK2005*.ZIP -d ${commerceDir}/core-customize"
    **/
	def workspace = "C:/jenkins/workspace"
	 bat "tar -xvf ${workspace}/CXCOM200500P_0-70004955.zip  -C ${commerceDir}"
}  