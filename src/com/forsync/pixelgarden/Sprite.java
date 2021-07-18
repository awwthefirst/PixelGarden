package com.forsync.pixelgarden;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sprite {
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(String name, int scaleX, int scaleY) throws FileNotFoundException {
        final String dir = "resources\\sprites\\";
        final String path = dir + name;
        Image unscaledImage = new Image(new FileInputStream(path));
        image = new Image(new FileInputStream(path),
                scaleX * unscaledImage.getWidth(),
                scaleY * unscaledImage.getHeight(), false, true);
    }
}
