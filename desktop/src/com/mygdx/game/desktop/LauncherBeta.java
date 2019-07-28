
package com.mygdx.game.desktop;

/**
 *
 * @author lserd
 */
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygdx.game.StarfishCollectorBeta;

public class LauncherBeta 
{
    public static void main (String[] args)
    {
        Game myGame = new StarfishCollectorBeta();
        LwjglApplication launcher =
        new LwjglApplication( myGame, "Starfish Collector", 640, 480 );
    }    
}
