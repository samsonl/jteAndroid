  
allow_scm_jenkinsfile=true

application_environments {
  global {
     merge = true
     A = "jteconfg A"
  }
}

libraries {
   merge = true 
  override=true
  
  libcommon {
    B="libcommon pipeline_config B"
  }
}
