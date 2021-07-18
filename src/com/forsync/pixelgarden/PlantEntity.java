package com.forsync.pixelgarden;

import java.io.FileNotFoundException;

public class PlantEntity extends Entity {

    private int lv = 1;
    private int maxLv;
    private final String name;

    public PlantEntity(String name, int x, int y, int scaleX, int scaleY, int maxLv) throws FileNotFoundException {
        super(name + "_lv1.png", x, y, scaleX, scaleY);
        this.name = name;
        this.maxLv = maxLv;
    }

    @Override
    public void OnClick() {
        super.OnClick();
        if (lv != maxLv) {
            lv++;
        } else {
            lv = 1;
        }
        try {
            sprite.setImage(name + "_lv" + lv + ".png", scaleX, scaleY);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
