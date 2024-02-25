import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    kotlin("jvm") version libs.versions.kotlin.get()
    alias(libs.plugins.shadow)
    alias(libs.plugins.userdev)
    alias(libs.plugins.pluginyml)
    alias(libs.plugins.runtask)
}

group = "wtf.nucker"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    paperweight.paperDevBundle(libs.versions.minecraft)
    implementation(libs.configurate)
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    assemble {
        dependsOn(reobfJar)
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}

bukkit {
    load = BukkitPluginDescription.PluginLoadOrder.POSTWORLD
    main = "wtf.nucker.paperkotlintemplate.PaperKotlinTemplate"
    apiVersion = "1.20"

    name = "PaperKotlinTemplate"
    description = "Description"
    authors = listOf("Nucker")
    website = "nucker.me"
    prefix = name
}