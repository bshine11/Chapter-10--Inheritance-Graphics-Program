import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Locomotive extends Train {
	protected Scoop scoop; // a locomotive has a scoop
	protected Funnel funnel; // a locomotive has a funnel

	public Locomotive(Point cS, int cW, int cH, Color cC, Color wC, Point sS, //overloaded constructor
			Point fS) {
		super(cS, cW, cH, cC, wC);
		scoop = new Scoop(sS);
		funnel = new Funnel(fS);
	}

	public void drawLocomotive(Graphics g) {
		drawTrain(g);
		scoop.drawScoop(g);
		funnel.drawFunnel(g);
	}

}

class Scoop {
	private Point scoopStart;

	public Scoop(Point sS) { // constructor of scoop
		scoopStart = sS;

	}

	public void drawScoop(Graphics g) { // draw scoop method
		g.setColor(Color.black);
		Polygon triangle = new Polygon();
		triangle.addPoint(scoopStart.getX() - 40, scoopStart.getY() + 75);
		triangle.addPoint(scoopStart.getX(), scoopStart.getY() + 75);
		triangle.addPoint(scoopStart.getX(), scoopStart.getY() + 35);
		g.fillPolygon(triangle);
	}

}

class Funnel {
	private Point funnelStart;

	public Funnel(Point fS) { // constructor of scoop
		funnelStart = fS;

	}

	public void drawFunnel(Graphics g) {
		// draw the funnel
		g.setColor(Color.black);
		g.fillRect(funnelStart.getX() + 15, funnelStart.getY(), 15, -20);
		Polygon funnel = new Polygon();
		funnel.addPoint(funnelStart.getX(), funnelStart.getY() - 40); // top
																		// left
		funnel.addPoint(funnelStart.getX() + 45, funnelStart.getY() - 40); // top
																			// right
		funnel.addPoint(funnelStart.getX() + 45, funnelStart.getY() - 35); // down
																			// right
		funnel.addPoint(funnelStart.getX() + 30, funnelStart.getY() - 20); // slant
																			// right
		funnel.addPoint(funnelStart.getX() + 15, funnelStart.getY() - 20); // bottom
		funnel.addPoint(funnelStart.getX(), funnelStart.getY() - 35); // slant
																		// left
		g.fillPolygon(funnel);
	}

}
