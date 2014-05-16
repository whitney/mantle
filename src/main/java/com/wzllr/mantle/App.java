package com.wzllr.mantle;

import com.wzllr.mantle.engine.Game;
import com.wzllr.mantle.engine.Time;
import com.wzllr.mantle.engine.Window;

public class App {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Mantle";
    public static final double FRAME_CAP = 5000.0;

    private boolean isRunning;
    private Game game;

    public App() {
        isRunning = false;
        game = new Game();
    }

    public void start() {
        if (isRunning)
            return;

        run();
    }

    public void stop() {
        if (!isRunning)
            return;

        isRunning = false;
    }

    private void run() {
        isRunning = true;

        // FPS count
        int frames = 0;
        long frameCounter = 0;

        final double frameTime = 1.0 / FRAME_CAP;

        long lastTime = Time.getTime();
        double unprocessedTime = 0;

        while (isRunning) {
            boolean render = false;

            long startTime = Time.getTime();
            long elapsedTime = startTime - lastTime;
            lastTime = startTime;

            unprocessedTime += elapsedTime / (double)Time.SECOND;
            frameCounter += elapsedTime;

            while (unprocessedTime > frameTime) {
                unprocessedTime -= frameTime;

                render = true;

                if (Window.isCloseRequested()) {
                    stop();
                }

                Time.setDelta(frameTime);

                game.input();
                game.update();

                if (frameCounter >= Time.SECOND) {
                    System.out.println(frames);
                    frames = 0;
                    frameCounter = 0;
                }
            }

            if (render) {
                render();
                frames++;
            } else {
                try {
                Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        cleanUp();
    }

    private void render() {
        game.render();
        Window.render();
    }

    private void cleanUp() {
        Window.dispose();
    }

    public static void main( String[] args ) {
        Window.createWindow(WIDTH, HEIGHT, TITLE);

        App game = new App();

        game.start();
    }
}
