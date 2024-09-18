def call(Map config = [:]){
  if(!config.name){
    error "No script name provided config !"
  }
  
  def loadresource = libraryResource "com/planetpop/script/linux/${config.name}"
  writeFile file: "${config.name}", text: loadresource
  sh " chmod +x ./${config.name} "
}
