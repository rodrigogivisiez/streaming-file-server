pluginManagement {
  repositories {
    gradlePluginPortal()
    //google()
  }
}

rootProject.name = "streaming-file-server"

include(":modules:libraries:props")
include(":modules:libraries:web-security")

include(":modules:apps:file-items-service")
include(":modules:apps:file-server")

include(":modules:docker:postgres")
include(":modules:docker:all")
