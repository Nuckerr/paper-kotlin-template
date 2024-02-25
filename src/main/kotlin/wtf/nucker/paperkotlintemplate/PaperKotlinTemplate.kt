package wtf.nucker.paperkotlintemplate

import org.bukkit.plugin.java.JavaPlugin

class PaperKotlinTemplate : JavaPlugin() {

	override fun onEnable() {
		logger.info("Hello World!")
	}

	override fun onDisable() {
		super.onDisable()

	}
}