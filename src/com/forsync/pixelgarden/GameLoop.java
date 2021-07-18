package com.forsync.pixelgarden;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GameLoop extends Application {

    private ArrayList<Entity> entities;
    public static final int WIDTH = 1280, HEIGHT = 720;

    @Override
    public void start(Stage stage) {
        entities = new ArrayList<>();
        Setup.setup(entities);

        stage.setTitle("Pixel Garden");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        GraphicsContext g = canvas.getGraphicsContext2D();
        g.setImageSmoothing(false);

        final long startingTime = System.nanoTime();

        new AnimationTimer() {

            @Override
            public void handle(long currentTime) {
                double t = currentTime - startingTime / 1000000000.0;
                g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                for (Entity e : entities) {
                    if (e != null) {
                        g.drawImage(e.getSprite().getImage(),
                                e.getX(), e.getY());
                    }
                }
            }
        }.start();

        stage.show();
    }
}
