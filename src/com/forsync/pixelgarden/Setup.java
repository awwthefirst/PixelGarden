package com.forsync.pixelgarden;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Setup {

    public static void setup(ArrayList<Entity> entities) {
        try {
            entities.add(new Entity("shelves.png", GameLoop.WIDTH / 2, GameLoop.HEIGHT / 2, 4,
                    4));
            Entity peaPlant = new PlantEntity("pea_plant", 48, (35 - 13) * 4, 4, 4, 5);
            entities.add(peaPlant);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
