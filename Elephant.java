
/**  Tortoise class
*    inherits from abstract Racer class
*/

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Elephant extends Racer {
	private Random rand = new Random();

	/**
	 * Default Constructor: calls Racer default constructor
	 */
	public Elephant() {
		super();

	}

	/**
	 * Constructor
	 * 
	 * @param rID racer Id, passed to Racer constructor
	 * @param rX  x position, passed to Racer constructor
	 * @param rY  y position, passed to Racer constructor
	 */
	public Elephant(String rID, int rX, int rY) {
		super(rID, rX, rY);
	}

	/**
	 * move: calculates the new x position for the racer Elephant move
	 * characteristics: Steady Speed increment x by 1 most of the time
	 */
	public void move() {
		int move = rand.nextInt(10) + 1;
		if (move < 8) {
			setX(getX() + 2);
			setY(getY());
		} 
		else {
			setX(getX());
			setY(getY() - 1);
		}
	}

	/**
	 * draw: draws the Tortoise at current (x, y) coordinate
	 * 
	 * @param g Graphics context
	 */
	public void draw(Graphics g) {
		int startX = getX();
		int startY = getY();

		g.setColor(new Color(192, 192, 192)); // Grey
		

		// body
		g.fillOval(startX - 22, startY, 35, 25);

		// head
		g.fillOval(startX - 30, startY - 3, 15, 15);

		// tail
		g.fillOval(startX + 10, startY + 10 , 5, 15);
		
		//trunk
		g.fillOval(startX - 33, startY - 1 , 5, 15);
		

		g.fillOval(startX - 11, startY + 23, 5, 5);
		g.fillOval(startX - 2, startY + 23, 5, 5);
		
		if (this.isWinner) {
			morph(g);
		}		
		
	}
	
	@Override 
	public void morph(Graphics g) {
		int startX = getX();
		int startY = getY();

		g.setColor(Color.pink); // Grey
		

		// body
		g.fillOval(startX - 22, startY, 40, 30);

		// head
		g.fillOval(startX - 30, startY - 3, 20, 20);
		
		//Legs
		g.fillOval(startX - 11, startY + 27, 10, 10);
		g.fillOval(startX - 2, startY + 27, 10, 10);
		
		g.setColor(Color.MAGENTA);
		// tail
		g.fillOval(startX + 15, startY + 10 , 5, 15);
			
		//trunk
		g.fillOval(startX - 33, startY - 1 , 5, 15);
		
	}
}