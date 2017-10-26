package es.deusto.prog3.tutorial;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{
	

	public Menu(int state) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("Are u ready to blast some HAAAAAM!", 50, 50);
		g.drawRect(50, 100, 60, 120); // x, y, width, height
		g.drawOval(200, 130, 200, 80);;
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}
	
	public int getID() {
		return 0;
	}

	
	

}
