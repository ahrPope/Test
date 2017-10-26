package game.state;

import game.Game;
import game.character.Player;
import game.controller.MouseAndKeyBoardPlayerController;
import game.controller.PlayerController;
import game.level.Level;
import game.physics.Physics;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;;

public class LevelState extends BasicGameState{
	
	Physics physics = new Physics();
	Level level;
	String startingLevel;
	private Player player;
	private PlayerController playerController;
	
	public LevelState(String startingLevel) {
		this.startingLevel = startingLevel;
	}

	@Override
    public void init(GameContainer container, StateBasedGame sbg) throws SlickException {
	     
        //at the start of the game we don't have a player yet
         player = new Player(128,415);
  
         //once we initialize our level, we want to load the right level
         level = new Level(startingLevel, player);
  
         //and we create a controller, for now we use the MouseAndKeyBoardPlayerController
         playerController = new MouseAndKeyBoardPlayerController(player);
  
         physics = new Physics();
     }

	@Override
	public void render(GameContainer container, StateBasedGame sbg, Graphics g) throws SlickException {
		g.scale(Game.SCALE, Game.SCALE);
		level.render();
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame sbg, int delta) throws SlickException {
		//every update we have to handle the input from the player
		playerController.handleInput(container.getInput(), delta);
		physics.handlePhysics(level, delta);
		
	}
	
	//this method is overriden from basicgamestate and will trigger once you press any key on your keyboard
	public void keyPressed(int key, char code) {
		//if the key is escape, close our application
		if(key == Input.KEY_ESCAPE) {
			System.exit(0);
		}
	}

	@Override
	public int getID() {
		//this is the id for chaging states
		return 0;
	}
	

}
