plugins {
    java
    idea
    // line-gradle-scripts pre-requisites
    id("com.google.osdetector") version "1.6.2" apply false
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.1.0"

    kotlin("jvm") version "1.7.20"
}

rootProject.apply {
    from("gradle/scripts/build-flags.gradle")
}

allprojects {
    repositories {
        mavenCentral()
    }
}
