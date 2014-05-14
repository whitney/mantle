package com.wzllr.mantle.engine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

/**
 * Created with IntelliJ IDEA.
 * User: whitney
 * Date: 5/13/14
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Window {
	public static void createWindow(int width, int height, String title) {
		Display.setTitle(title);
		try {
		Display.setDisplayMode(new DisplayMode(width, height));
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
	}
}
