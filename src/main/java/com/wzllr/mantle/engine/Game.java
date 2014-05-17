package com.wzllr.mantle.engine;

import org.lwjgl.input.Keyboard;

public class Game {

    public Game() {

    }

    public void input() {
        if (Input.getKeyDown(Keyboard.KEY_UP)) {
            System.out.println("we've just pressed up!");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)) {
            System.out.println("we've just released up!");
        }

        if (Input.getMouseDown(1)) {
            System.out.println("we've just right clicked at " + Input.getMousePosition());
        }
        if (Input.getMouseUp(1)) {
            System.out.println("we've just released right mouse button!");
        }
    }

    public void update() {

    }

    public void render() {

    }
}
