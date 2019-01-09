import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Animal {
	public int xPos;
	public int yPos;
	private int animalW;
	private int animalH;
	private Color animalColor;
	private int min = -5;
	private int max = 5;

	private final static int WIN_WIDTH = 900;
	private final static int WIN_HEIGHT = 600;

	private int range = (max - min) + 1;  
	private int directionX = (int)(Math.random() * range) + min;
	private int directionY = (int)(Math.random() * range) + min;

	
	Random num = new Random();
	private int stripe = num.nextInt(2);
	private int tailSize = num.nextInt(2);

	public Animal() {
		animalW = 150;
		animalH = 50;

		xPos = WIN_WIDTH / 2 - animalW / 2;
		yPos = WIN_HEIGHT / 2 - animalH / 2;

		animalColor = Color.ORANGE;		
	}

	public Animal(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		animalW = w;
		animalH = h;
		animalColor = c;
	}

	public void movement() {
		xPos += directionX;
		yPos += directionY; 
	}

	public void drawAnimal(Graphics g) {

		g.setColor(Color.BLACK); // draw eyes
		g.fillOval(xPos+4, yPos+7, animalW/8, animalH/4);
		g.fillOval(xPos+4, yPos+31, animalW/8, animalH/4);	

		g.setColor(animalColor); 
		g.fillOval(xPos, yPos, animalW, animalH); // draw body

		g.fillOval(xPos+50, yPos-35, animalW/6, animalH); // draw fins
		g.fillOval(xPos+50, yPos+35, animalW/6, animalH);
		g.fillArc(xPos+40, yPos-35, animalW/3, animalH*2, 180, -90); 
		g.fillArc(xPos+40, yPos-15, animalW/3, animalH*2, 180, 90);

		if (tailSize == 1) {
			g.fillOval(xPos+140, yPos, animalW/3, animalH/2); // draw tail
			g.fillOval(xPos+140, yPos+13, animalW/3, animalH/2);
			g.fillOval(xPos+140, yPos+25, animalW/3, animalH/2);		
		}

		else {
			g.fillOval(xPos+140, yPos+5, animalW/3, animalH/2);
			g.fillOval(xPos+140, yPos+20, animalW/3, animalH/2);	
		}

		g.setColor(Color.BLACK);
		if (stripe == 1) {
			g.drawLine(xPos+30, yPos+15, xPos+120, yPos+15);
			g.drawLine(xPos+30, yPos+25, xPos+130, yPos+25);
			g.drawLine(xPos+30, yPos+35, xPos+120, yPos+35);
		}

		else {
			g.drawLine(xPos+30, yPos+20, xPos+130, yPos+20);
			g.drawLine(xPos+30, yPos+30, xPos+130, yPos+30);
		}

	}
}