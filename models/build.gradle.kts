plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.google.code.gson:gson:2.8.6")
    implementation ("com.intellij:annotations:12.0")
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.4")
    annotationProcessor ("org.projectlombok:lombok:1.18.+")
    implementation ("com.google.code.gson:gson:2.8.6")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}