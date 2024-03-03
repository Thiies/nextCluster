plugins {
    id("io.spring.dependency-management") version "1.1.4"
    id("org.springframework.boot") version "3.3.0-SNAPSHOT"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    maven { url = uri("https://repo.spring.io/milestone") }
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    annotationProcessor(libs.crd)
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "net.nextcluster.rest.NextClusterRestStarter"
    }
    archiveFileName.set("rest.jar")
}
