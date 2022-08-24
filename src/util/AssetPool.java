package util;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class AssetPool {
	public static String projectPath;
	private static HashMap<String, BufferedImage> images = new HashMap<>();

	public static BufferedImage getImage(String name) {
		if (images.containsKey(name)) {
			return images.get(name);
		} else {
			try {
				BufferedImage image = ImageIO.read(new File(projectPath + name + ".png"));
				images.put(name, image);
				return image;
			} catch (IOException e) {
				System.out.println("Could not read file: " + name);
				e.printStackTrace();
				return null;
			}
		}
	}
	
	public LevelData loadLevel(String fileName) {

        try {
			String source = new String(Files.readAllBytes(Paths.get(projectPath + fileName + ".png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
