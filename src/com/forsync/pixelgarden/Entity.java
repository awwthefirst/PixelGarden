package com.forsync.pixelgarden;

import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;

import java.io.FileNotFoundException;

public class Entity {
    private double x, y;
    protected int scaleX, scaleY;
    protected final Sprite sprite;

    public Entity(String spriteName, int x, int y, int scaleX, int scaleY)
            throws FileNotFoundException {
        this.sprite = new Sprite();
        this.sprite.setImage(spriteName, scaleX, scaleY);
        this.x = x;
        this.y = y;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public double getX() {
        return x - (getWidth() / 2);
    }

    public double getY() {
        return y - (getHeight() / 2);
    }

    public double getWidth() {
        return sprite.getImage().getWidth();
    }

    public double getHeight() {
        return sprite.getImage().getHeight();
    }

    public Rectangle getBounds() {
        return new Rectangle(getX(), getY(), getWidth(), getHeight());
    }

    public void OnClick() {

    }
}
