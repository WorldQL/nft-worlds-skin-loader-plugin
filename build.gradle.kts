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
    implementation("com.mojang:authlib:3.3.39")
    implementation(files("vendor/CustomSkinLoader_Fabric-14.14-SNAPSHOT-323.jar"))
}
