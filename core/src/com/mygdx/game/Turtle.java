
package com.mygdx.game;

/**
 *
 * @author lserd
 */
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Turtle extends BaseActor
{
    public Turtle(float x, float y, Stage s)
    {
        super(x,y,s);
        
        String[] filenames =  {"assets/turtle-1.png", "assets/turtle-2.png", "assets/turtle-3.png", "assets/turtle-4.png", "assets/turtle-5.png", "assets/turtle-6.png"};
        
        loadAnimationFromFiles(filenames,0.1f,true);
    }
    
    @Override
    public void act(float dt)
    {
       super.act(dt);
       if (Gdx.input.isKeyPressed(Keys.LEFT))
           this.moveBy(-1,0);
       if (Gdx.input.isKeyPressed(Keys.RIGHT))
           this.moveBy(1,0);
       if (Gdx.input.isKeyPressed(Keys.UP))
           this.moveBy(0,1);
       if (Gdx.input.isKeyPressed(Keys.DOWN))
           this.moveBy(0,-1);
    }
}
