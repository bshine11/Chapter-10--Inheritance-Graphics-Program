import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

class Caboose extends Train {
	protected Windows windows;
	protected Cupola cupola;

	public Caboose(Point cS, int cW, int cH, Color cC, Color wC, Point wS,  //overloaded constructor
			Point cuS) {
		super(cS, cW, cH, cC, wC);
		windows = new Windows(wS);
		cupola = new Cupola(cuS);
	}

	public void drawCaboose(Graphics g) {
		drawTrain(g);
		windows.drawWindows(g);
		cupola.drawCupola(g);
	}
}

class Windows {
	private Point windowsStart;

	public Windows(Point wS) { // constructor of windows
		windowsStart = wS;
	}

	public void drawWindows(Graphics g) { // draw Windows method
		g.setColor(Color.white);
		g.fillRect(windowsStart.getX() + 15, windowsStart.getY() + 20, 25, 25);
		g.fillRect(windowsStart.getX() + 60, windowsStart.getY() + 20, 25, 25);
	}

}

class Cupola {
	private Point cupolaStart;

	public Cupola(Point cuS) { // constructor of cupola
		cupolaStart = cuS;
	}

	public void drawCupola(Graphics g) { // draw Cupola method
		g.setColor(Color.red);
		g.fillRect(cupolaStart.getX() + 15, cupolaStart.getY(), 70, -5);
		g.setColor(Color.black);
		g.fillRect(cupolaStart.getX() + 10, cupolaStart.getY() - 5, 80, -3);

	}

}
