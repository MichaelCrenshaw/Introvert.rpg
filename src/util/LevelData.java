package util;

public class LevelData {
	
	private int[][] world;
	private int worldWidth, worldHeight;
	
	public LevelData(int[][] world, int worldWidth, int worldHeight) {
		super();
		this.world = world;
		this.worldWidth = worldWidth;
		this.worldHeight = worldHeight;
	}
	
	public int[][] getWorld() {
		return world;
	}
	public int getWorldWidth() {
		return worldWidth;
	}
	public int getWorldHeight() {
		return worldHeight;
	}
	
}
