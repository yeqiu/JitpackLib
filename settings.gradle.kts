pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        //本地仓库
        mavenLocal()
        //jitpack
        maven { setUrl("https://jitpack.io") }
    }
}

rootProject.name = "JitpackLib"
include(":app")
include(":lib")
