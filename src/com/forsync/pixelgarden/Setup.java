package com.forsync.pixelgarden;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Setup {

    public static void setup(ArrayList<Entity> entities) {
        try {
            Entity peaPlant = new Entity("pea_plant_lv1.png", GameLoop.WIDTH / 2,
                    GameLoop.HEIGHT / 2, 2, 2);
            entities.add(peaPlant);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
