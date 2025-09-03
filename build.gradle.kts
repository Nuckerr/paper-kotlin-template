import net.minecrell.pluginyml.bukkit.BukkitPluginDescription
import net.minecrell.pluginyml.paper.PaperPluginDescription
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

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

paper {
    load = BukkitPluginDescription.PluginLoadOrder.POSTWORLD
    main = "wtf.nucker.paperkotlintemplate.PaperKotlinTemplate"
    apiVersion = "1.21"

    name = "PaperKotlinTemplate"
    description = "Description"
    authors = listOf("Nucker")
    website = "nucker.me"
    prefix = name

    serverDependencies {
        register("RuntimeDependency") {
            required = false
            load = PaperPluginDescription.RelativeLoadOrder.BEFORE
        }
    }

    foliaSupported = false
}

tasks {
    runServer {
        downloadPlugins {
            // ...
        }
    }

    build {
        dependsOn(shadowJar)
    }

    assemble {
        dependsOn(reobfJar)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
    }
}