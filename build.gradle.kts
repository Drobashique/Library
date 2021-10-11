plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
        url = uri("https://maven.restlet.com")
    }
}

dependencies {
    implementation ("com.google.code.gson:gson:2.8.6")
    implementation ("com.intellij:annotations:12.0")
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.4")
    annotationProcessor ("org.projectlombok:lombok:1.18.+")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}