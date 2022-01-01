pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "PutridPaper"

include("PutridPaper-api", "PutridPaper-server")
