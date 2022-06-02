// We need to match library versions used by Minecraft
@file:Suppress("GradlePackageUpdate")

plugins {
    java
}

group = "com.worldql"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://libraries.minecraft.net/")
}

dependencies {
    // All provided in a Minecraft env:
    implementation("com.mojang:authlib:3.3.39")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("org.jetbrains:annotations:23.0.0")

    implementation(files("vendor/CustomSkinLoader_Fabric-14.14-SNAPSHOT-323.jar"))
}
