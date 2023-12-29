pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "AndroidDemo"
include(":app")
include(":widget")
include(":multiprocess")
include(":message")
include(":wanandroid")
include(":wanandroid:app")