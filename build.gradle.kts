plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.famerates"
version = "1.2.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.famerates.MainKt" // Ensure this is the correct class name
    }
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}
