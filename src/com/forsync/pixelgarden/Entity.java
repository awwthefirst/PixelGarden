package com.forsync.pixelgarden;

import javafx.geometry.Point2D;

import javax.swing.text.Position;
import java.io.FileNotFoundException;

public class Entity {
    private double x, y;
    private Sprite sprite;

    public Entity(String spriteName, int x, int y, int scaleX, int scaleY)
            throws FileNotFoundException {
        this.sprite = new Sprite();
        this.sprite.setImage(spriteName, scaleX, scaleY);
        this.x = x;
        this.y = y;
    }

    public Entity(String spriteName, int x, int y) throws FileNotFoundException {
        this(spriteName, x, y, 1, 1);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public double getX() {
        return x - (sprite.getImage().getWidth() / 2);
    }

    public double getY() {
        return y - (sprite.getImage().getHeight() / 2);
    }
}
