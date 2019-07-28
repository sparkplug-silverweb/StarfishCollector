
package com.mygdx.game.desktop;

/**
 *
 * @author lserd
 */
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygdx.game.StarfishCollector;

public class Launcher 
{
    public static void main (String[] args)
    {
        Game myGame = new StarfishCollector();
        LwjglApplication launcher =
        new LwjglApplication( myGame, "Starfish Collector", 640, 480 );
    }
}
