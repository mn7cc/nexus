package me.mn7cc.nexus.custom;

import java.util.List;

import org.bukkit.entity.Player;

public class ArgumentData {

	private String s;
	private double d;
	private int i;
	private Player player;
	private List<Player> players;
	
	public ArgumentData() {
		
	}
	
	public void setString(String s) { this.s = s; }
	public void setDouble(double d) { this.d = d; }
	public void setInteger(int i) { this.i = i; }
	public void setPlayer(Player player) { this.player = player; }
	public void setPlayers(List<Player> players) { this.players = players; }
	
	public String getString() { return s; }
	public double getDouble() { return d; }
	public int getInteger() { return i; }
	public Player getPlayer() { return player; }
	public List<Player> getPlayers() { return players; }
	
}
