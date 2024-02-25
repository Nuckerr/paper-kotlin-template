# Paper Kotlin Template
A template for basic Paper plugins written in Kotlin, using Gradle. Simply change out my information
for yours, and you're good to go!

## Features:

- Paperweight userdev plugin - Get the latest Paper API features, plus access to Minecraft NMS.
- run-task plugin - Run a test server with your plugin, easily right from your IntelliJ IDE
- plugin-yml bukkit plugin - Bring your plugin.yml into your build file
- libs.toml pre-setup - Organise your dependencies into your libs.toml
- GitHub workflows - to check your code from GitHub
- .gitignore - to make sure only the important stuff's being published

## Setup
1. Clone the repository
2. Delete the `.git` folder to reset the git history
3. Refactor the plugin name & package id in the file strucutre
4. Update information in the `build.gradle.kts`
5. Run the build, or the run configuration to test the plugin all works
6. Hit the ground running!


## Versions
I will try to keep everything up to date, though do check, and feel free to pr/update.
Currently on:

`kotlin`: `1.9.22`
`minecraft`: `1.20.4-R0.1-SNAPSHOT`
`java`: 17


## Run Configurations
- Use `Build Project` config to build the plugin.
- Use `Run Project` to run your plugin in a test server, within IntelliJ.

## Gradle Commands
```
------------------------------------------------------------
Tasks runnable from root project 'paper-kotlin-template'
------------------------------------------------------------

Build tasks
-----------
assemble - Assembles the outputs of this project.
build - Assembles and tests this project.
buildDependents - Assembles and tests this project and all projects that depend on it.
buildKotlinToolingMetadata - Build metadata json file containing information about the used Kotlin tooling
buildNeeded - Assembles and tests this project and all projects it depends on.
classes - Assembles main classes.
clean - Deletes the build directory.
jar - Assembles a jar archive containing the classes of the 'main' feature.
kotlinSourcesJar - Assembles a jar archive containing the sources of target 'kotlin'.
testClasses - Assembles test classes.

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Documentation tasks
-------------------
javadoc - Generates Javadoc API documentation for the 'main' feature.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project 'paper-kotlin-template'.
dependencies - Displays all dependencies declared in root project 'paper-kotlin-template'.
dependencyInsight - Displays the insight into a specific dependency in root project 'paper-kotlin-template'.
help - Displays a help message.
javaToolchains - Displays the detected java toolchains.
kotlinDslAccessorsReport - Prints the Kotlin code for accessing the currently available project extensions and conventions.
outgoingVariants - Displays the outgoing variants of root project 'paper-kotlin-template'.
projects - Displays the sub-projects of root project 'paper-kotlin-template'.
properties - Displays the properties of root project 'paper-kotlin-template'.
resolvableConfigurations - Displays the configurations that can be resolved in root project 'paper-kotlin-template'.
tasks - Displays the tasks runnable from root project 'paper-kotlin-template'.

Paperweight tasks
-----------------
cleanAllPaperweightUserdevCaches - Delete the project & all shared paperweight-userdev setup cache.
cleanCache - Delete the project paperweight-userdev setup cache.
reobfJar - Remap the compiled plugin jar to Spigot's obfuscated runtime names.

Plugin-yml tasks
----------------
generateBukkitPluginDescription

Run Paper tasks
---------------
cleanPaperCache - Delete all locally cached Paper jars.
cleanPaperPluginsCache - Delete all locally cached Paper plugin jars.
runMojangMappedServer - Run a Mojang mapped Paper server for plugin testing, by integrating with paperweight.
runServer - Run a Paper server for plugin testing.

Run Task Shared tasks
---------------------
cleanAllRunTaskCaches - Deleted all jars that run-task plugins have cached locally. Includes plugins and server/proxy jars.
cleanCustomServiceCaches - Delete all locally cached jars for custom downloads API service registrations.

Shadow tasks
------------
knows - Do you know who knows?
shadowJar - Create a combined JAR of project and runtime dependencies

Verification tasks
------------------
check - Runs all checks.
checkKotlinGradlePluginConfigurationErrors - Checks that Kotlin Gradle Plugin hasn't reported project configuration errors, failing otherwise. This task always runs before compileKotlin* or similar tasks.
test - Runs the test suite.
```