package mainGame;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
	/*------Attributes------*/
	private final int SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	private final int SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	private final int SCREEN_CENTER_X = SCREEN_WIDTH / 2;
	private final int SCREEN_CENTER_Y = SCREEN_HEIGHT / 2;
	
	/*------Main program------*/
	public static void main(String[] args) {
		Main m = new Main();
	}
	
	/*------Functions used in the main program------*/
	public Main() {
		//Window setup
		super("Game window");
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create the game screen and add it to the window
		GameScreen gs = new GameScreen();
		add(gs);
		
		//Makes sure everything within the window is visible
		setVisible(true);
	}
}
