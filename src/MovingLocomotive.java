import java.awt.Color;
import java.awt.Graphics;

class MovingLocomotive extends Locomotive {
	protected Smoke smoke; // a moving locomotive has smoke

	public MovingLocomotive(Point cS, int cW, int cH, Color cC, Color wC, //overloaded constructor
			Point sS, Point fS, Point smS) {
		super(cS, cW, cH, cC, wC, sS, fS);
		smoke = new Smoke(smS);
	}

	public void drawMovingLocomotive(Graphics g) {
		drawLocomotive(g);
		smoke.drawSmoke(g);
	}

}

class Smoke {
	private Point smokeStart;

	public Smoke(Point smS) { // constructor of smoke
		smokeStart = smS;
	}

	public void drawSmoke(Graphics g) { // draw Smoke method
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(smokeStart.getX(), smokeStart.getY() - 55, 15, 15);
		g.fillOval(smokeStart.getX() + 10, smokeStart.getY() - 75, 25, 25);
		g.fillOval(smokeStart.getX() + 32, smokeStart.getY() - 95, 35, 35);
	}
}
