rootProject.name = "paper-kotlin-template"

dependencyResolutionManagement {
	versionCatalogs {
		register("libs") {
			from(files("./libs.toml"))
		}
	}
}