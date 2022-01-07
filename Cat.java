
/**  Tortoise class
 *    inherits from abstract Racer class
 */

import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Cat extends Racer {
	private Random rand = new Random();

	/**
	 * Default Constructor: calls Racer default constructor
	 */
	public Cat() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param rID racer Id, passed to Racer constructor
	 * @param rX  x position, passed to Racer constructor
	 * @param rY  y position, passed to Racer constructor
	 */
	public Cat(String rID, int rX, int rY) {
		super(rID, rX, rY);
	}

	/**
	 * move: calculates the new x position for the racer Cat move characteristics:
	 * "slow & steady wins the race" increment x by 1 most of the time
	 */
	public void move() {
		int move = rand.nextInt(10) + 1;
		if (move < 8) {
			setX(getX() + 5);
		}
		else {
			setX(getX() - 8);
		}
	}

	/**
	 * draw: draws the Cat at current (x, y) coordinate
	 * 
	 * @param g Graphics context
	 */
	public void draw(Graphics g) {
		int startX = getX();
		int startY = getY();

		g.setColor(new Color(210, 105, 30)); // Cinnamon
		
		//Ears
		g.fillPolygon(new int[] {startX - 14, startX - 12, startX - 10} , new int[] {startY - 6, startY - 20, startY - 8}, 3);
		g.fillPolygon(new int[] {startX - 9, startX - 7, startX - 6} , new int[] {startY - 8, startY - 20, startY - 6}, 3);

		// head
		g.fillOval(startX - 18, startY - 10, 15, 15); //(x,y, int width, int height

		// body
		g.fillOval(startX - 30 , startY , 30, 40);

		//tail
		g.fillOval(startX - 34, startY + 25, 10, 10);

		// feet
		g.setColor(new Color(210, 105, 30)); // brown
		g.fillOval(startX - 25, startY + 35, 5, 5);
		g.fillOval(startX - 11, startY + 35, 5, 5);
		
		if (this.isWinner) {
			morph(g);
		}
	}
	@Override
	public void morph(Graphics g) {
		int startX = getX();
		int startY = getY();

		g.setColor(Color.blue); // Cinnamon
		
		//Ears
		g.fillPolygon(new int[] {startX - 14, startX - 12, startX - 8} , new int[] {startY - 6, startY - 30, startY - 8}, 3);
		g.fillPolygon(new int[] {startX - 9, startX - 7, startX - 6} , new int[] {startY - 8, startY - 25, startY - 6}, 3);
		
		g.setColor(Color.yellow);

		// head
		g.fillOval(startX - 18, startY - 10, 15, 15); //(x,y, int width, int height

		// body
		g.fillOval(startX - 30 , startY , 30, 40);

		//tail
		g.fillOval(startX - 34, startY + 25, 10, 10);

		// feet
		g.setColor(new Color(210, 105, 30)); // brown
		g.fillOval(startX - 25, startY + 35, 10, 10);
		g.fillOval(startX - 11, startY + 35, 10, 10);
	}

}