
buildscript {
    extra.set("kotlinVersion", "1.3.21")

    repositories {
        google()
        jcenter()

    }
    dependencies {
        val kotlinVersion = rootProject.extra.get("kotlinVersion")

        classpath("com.android.tools.build:gradle:3.4.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
