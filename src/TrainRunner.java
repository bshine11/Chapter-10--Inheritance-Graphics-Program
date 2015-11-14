/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 11-12-15             
 * Inheritance Graphics Program
 *                                   *
 ************************************/
import java.awt.*;
import java.applet.*;

public class TrainRunner extends Applet {
	public void init() {
		setSize(800, 600);
	}

	public void paint(Graphics g) {
		Point point1 = new Point(50, 200);
		MovingLocomotive loco = new MovingLocomotive(point1, 100, 75,
				Color.blue, Color.black, point1, point1, point1);
		loco.drawMovingLocomotive(g);
		Point point2 = new Point(160, 200);
		Train train2 = new Train(point2, 100, 75, Color.green, Color.black); // green
																				// car
		train2.drawTrain(g);
		Point point3 = new Point(270, 200);
		Train train3 = new Train(point3, 100, 75, Color.yellow, Color.black); // yellow
																				// car
		train3.drawTrain(g);
		Point point4 = new Point(380, 200);
		Train train4 = new Train(point4, 100, 75, Color.magenta, Color.black); // magenta
																				// car
		train4.drawTrain(g);
		Point point5 = new Point(490, 200);
		Train train5 = new Train(point5, 100, 75, Color.cyan, Color.black); // cyan
																			// car
		train5.drawTrain(g);
		Point point6 = new Point(600, 200);
		Caboose caboose = new Caboose(point6, 100, 75, Color.red, Color.black,
				point6, point6); // red car
		caboose.drawCaboose(g);

	}
}
