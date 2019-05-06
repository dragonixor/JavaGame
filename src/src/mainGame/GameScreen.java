package mainGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GameScreen extends JPanel implements ActionListener, KeyListener{
	/**
	 * no clue what that is but it made a warning go away
	 */
	private static final long serialVersionUID = 1L;

	/*-----Attributes for GameScreen-----*/
	private final int SCREEN_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	private final int SCREEN_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	private final int SCREEN_CENTER_X = SCREEN_WIDTH / 2;
	private final int SCREEN_CENTER_Y = SCREEN_HEIGHT / 2;
	private final int GAME_SCREEN_WIDTH = 800;
	private final int GAME_SCREEN_HEIGHT = 600;
	private final int GAME_SCREEN_X = SCREEN_CENTER_X - (GAME_SCREEN_WIDTH / 2);
	private final int GAME_SCREEN_Y = SCREEN_CENTER_Y - (GAME_SCREEN_HEIGHT / 2);
	private boolean gameIsOn = false;
	private Timer timer;
	private int delay = 0;

	/*-----Attributes for game entities-----*/
	private int width = 100;
	private int height = 100;
	private int position_X = SCREEN_CENTER_X - (width / 2);
	private int position_Y = SCREEN_CENTER_Y - (height / 2);
	private int speed_X = 0;
	private int speed_Y = 0;

	//Constructor of GameScreen
	public GameScreen() {
		//Allows the current instance of GameScreen to receive inputs
		addKeyListener(this);

		//The two following statements guarantees that the current instance of
		//GameScreen will receive inputs and that the focus will not be taken 
		//away from it
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics g) {
		//Clears the gameScreen
		super.paint(g);

		//Background
		g.setColor(Color.black);
		g.fillRect(GAME_SCREEN_X, GAME_SCREEN_Y, GAME_SCREEN_WIDTH, GAME_SCREEN_HEIGHT);

		//Blue square
		g.setColor(Color.blue);
		g.fillRect(position_X, position_Y, width, height);


	}

	public void update() {
		move();
	}

	public void move() {
		position_Y += speed_Y;
		position_X += speed_X;
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		int keyCode = ke.getKeyCode();

		switch(keyCode) {
		case KeyEvent.VK_LEFT:
			speed_X = -2;
			break;
		case KeyEvent.VK_UP:
			speed_Y = -2;
			break;
		case KeyEvent.VK_RIGHT:
			speed_X = 2;
			break;
		case KeyEvent.VK_DOWN:
			speed_Y = 2;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		int keyCode = ke.getKeyCode();

		switch(keyCode) {
		case KeyEvent.VK_LEFT:
			speed_X = 0;
			break;
		case KeyEvent.VK_UP:
			speed_Y = 0;
			break;
		case KeyEvent.VK_RIGHT:
			speed_X = 0;
			break;
		case KeyEvent.VK_DOWN:
			speed_Y = 0;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent ke) {/*Not useful for now*/}

	//Updates the screen.
	@Override
	public void actionPerformed(ActionEvent ae) {
		update();
		repaint();
	}

}
