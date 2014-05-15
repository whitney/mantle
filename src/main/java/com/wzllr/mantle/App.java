package com.wzllr.mantle;

import com.wzllr.mantle.engine.Window;

public class App {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Mantle";

    public App() {

    }

    public void start() {
        run();
    }

    public void stop() {

    }

    public void run() {
        while (!Window.isCloseRequested()) {
            render();
        }
    }

    public void render() {
        Window.render();
    }

    public void cleanUp() {

    }

    public static void main( String[] args ) {
        Window.createWindow(WIDTH, HEIGHT, TITLE);

        App game = new App();

        game.start();
    }
}
