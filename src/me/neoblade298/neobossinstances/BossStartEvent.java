package me.neoblade298.neobossinstances;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BossStartEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private List<Player> fighters;
	private String bossName;
	
	public BossStartEvent(List<Player> fighters, String bossName) {
		this.fighters = fighters;
		this.bossName = bossName;
	}
	
	public List<Player> getFighters(){
		return fighters;
	}
	
	public String getBossName() {
		return bossName;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList(){
		return handlers;
	}
}
