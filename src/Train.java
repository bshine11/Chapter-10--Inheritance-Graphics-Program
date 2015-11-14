import java.awt.Color;
import java.awt.Graphics;

public class Train {
	protected Point carStart;
	protected Point wheelsStart;
	protected int carWidth;
	protected int carHeight;
	protected Color carColor;
	protected Color wheelsColor;

	public void drawTrain(Graphics g) { // draw train method
		g.setColor(carColor);
		g.fillRect(carStart.getX(), carStart.getY(), carWidth, carHeight);
		g.setColor(wheelsColor);
		g.fillOval(carStart.getX() + 5, carStart.getY() + 60, 30, 30);
		g.fillOval(carStart.getX() + 65, carStart.getY() + 60, 30, 30);
	}

	public Train() { // default constructor
		carStart = new Point(50, 200);
		carWidth = 100;
		carHeight = 75;
		carColor = Color.blue;
		wheelsColor = Color.black;
	}

	public Train(Point cS, int cW, int cH, Color cC, Color wC) { //overloaded constructor
		carStart = cS;
		carWidth = cW;
		carHeight = cH;
		carColor = cC;
		wheelsColor = wC;
	}

	public Point getCarStart() { //get methods
		return carStart;
	}

	public int getCarWidth() { // get methods
		return carWidth;
	}

	public int getCarHeight() { // get methods
		return carHeight;
	}

}
