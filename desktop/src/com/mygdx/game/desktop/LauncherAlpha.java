package com.mygdx.game.desktop;
/**
 *
 * @author lserd
 */
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygdx.game.StarfishCollectorAlpha;

public class LauncherAlpha {
    public static void main (String[] args)
    {
    Game myGame = new StarfishCollectorAlpha();
    LwjglApplication launcher = new LwjglApplication( myGame, "Starfish Collector", 800, 600 );
    }    
}
