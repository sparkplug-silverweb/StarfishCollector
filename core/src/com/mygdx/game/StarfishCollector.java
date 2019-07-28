
package com.mygdx.game;

/**
 *
 * @author lserd
 */

public class StarfishCollector extends GameBeta
{
    private Turtle turtle;
    private Starfish starfish;
    private BaseActor ocean;
    
    @Override
    public void initialize()
    {
        ocean = new BaseActor(0,0, mainStage);
        ocean.loadTexture("assets/water.jpg");
        ocean.setSize(640,480);
        
        starfish = new Starfish(380,380,mainStage);
        
        turtle = new Turtle(20,20, mainStage);
    }
    
    @Override
    public void update(float dt)
    {
        // code will be added later
    }
    
}
