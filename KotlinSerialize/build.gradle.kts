plugins {
    kotlin("jvm") version "1.9.22"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.6.21")
        implementation("com.google.code.gson:gson:2.8.9")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}