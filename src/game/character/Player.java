package game.character;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import game.level.tile.AABoundingRect;

public class Player extends Character {
    
    public Player(float x, float y) throws SlickException{
        super(x,y);
        setSprite(new Image("data/img/characters/player/player_idl_1.png"));
 
        setMovingAnimation(new Image[]{new Image("data/img/characters/player/player_left_1.png"),
        							   new Image("data/img/characters/player/player_left_2.png"),
                                       new Image("data/img/characters/player/player_left_3.png")}
                                       ,125);
        boundingShape = new AABoundingRect(x+3, y, 26, 32);
 
        accelerationSpeed = 0.001f;
        maximumSpeed = 0.15f;
        maximumFallSpeed = 0.3f;
        decelerationSpeed = 0.001f;
    }
 
    public void updateBoundingShape(){
        boundingShape.updatePosition(x+3,y);
    }
 
}
