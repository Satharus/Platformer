package com.oop.platformer.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.oop.platformer.GameClass;

import java.awt.*;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        config.addIcon("Icon/Icon128.png", Files.FileType.Internal);
        config.addIcon("Icon/Icon64.png", Files.FileType.Internal);
        config.addIcon("Icon/Icon32.png", Files.FileType.Internal);
        config.title = "Invasion 3102";
        config.width = (int) screenSize.getWidth();
        config.height = (int) screenSize.getHeight();
        /*
 		java - get screen size using the Toolkit class
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		config.width = (int)screenSize.getWidth();
		config.height = (int)screenSize.getHeight();
		config.backgroundFPS = 60;
		config.foregroundFPS = 60;
		config.resizable = false;
		config.fullscreen = true;
		*/

        new LwjglApplication(new GameClass((float) config.width, (float) config.height), config);
    }
}
