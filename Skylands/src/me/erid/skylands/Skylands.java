package me.erid.skylands;

import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;

public class Skylands extends JavaPlugin {
	
	@Getter
	private static Skyland instance;
	
	public void onEnable() {
		
		instance = this;
		
	}

}
