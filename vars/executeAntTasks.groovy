def call(commerceDir, antTasks, env, antOptions = "-Xmx512m -Dfile.encoding=UTF-8") {
        echo "##### Execute ant tasks : ${antTasks} #####"
        bat "cd ${commerceDir}/hybris/bin/platform && setantenv.bat && export ANT_OPTS=\"${antOptions}\" && ant ${antTasks} -Denv=${env}"
} 