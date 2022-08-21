package src.entities.core;

import java.awt.*;
import src.util.AssetPool;

public class Sprite {
    private static Image spriteImage;

    public Sprite(String fileName) {
        spriteImage = AssetPool.getImage("./assets/" + fileName);
    }

    public void changeSprite(String fileName) {
        spriteImage = AssetPool.getImage("./assets/" + fileName);
    }
}
