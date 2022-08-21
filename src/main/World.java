package main;

import src.util.LevelData;

public class World {
	
	int[][] tiles;
	int worldWidth, worldHeight;
	
	public World(int world_width, int world_height) {
		this.worldWidth = world_width;
		this.worldHeight = world_height;
		
		this.tiles = new int[worldWidth][worldHeight];
	}
	
	public World(LevelData data) {
		this.tiles = data.getWorld();
		this.worldWidth = data.getWorldWidth();
		this.worldHeight = data.getWorldHeight();
	}

	public int getWorldWidth() {
		return worldWidth;
	}

	public int getWorldWeight() {
		return worldHeight;
	}
	
	public int getTile(int x, int y) {
		return tiles[x][y];
	}
	
	public void setTile(int type, int x, int y) {
		this.tiles[x][y] = type;
	}
	
}
