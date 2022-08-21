package util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
	
	
}
