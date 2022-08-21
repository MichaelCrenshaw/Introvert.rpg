package src.entities.core;

import java.awt.*;
import src.utl.AssetManager;

public class Sprite {
    private static Image spriteImage;

    public Sprite(String fileName) {
        spriteImage = AssetManager.getImage("./assets/" + fileName);
    }

    public void changeSprite(String fileName) {
        spriteImage = AssetManager.getImage("./assets/" + fileName);
    }
}
