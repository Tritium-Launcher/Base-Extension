plugins {
    id("java")
    id("com.gradleup.shadow") version "9.1.0"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("io.github.tritium_launcher:api:0.1.7d")
}
