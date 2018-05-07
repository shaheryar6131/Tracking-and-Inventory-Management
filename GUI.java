import gpdraw.DrawingTool;
import gpdraw.SketchPad;

import java.awt.Color;

public class GUI{
	private Color RED = Color.red, BLUE = Color.blue, BLACK = Color.black,
			GRAY = Color.gray, YELLOW = Color.yellow, PINK = Color.pink,
			ORANGE = Color.orange, GREEN = Color.green,
			MAGENTA = Color.magenta, WHITE = Color.white;
	private DrawingTool pencil;
	private SketchPad canvas;

	public SquareAndCircle() {
		canvas = new SketchPad(600, 600);
		pencil = new DrawingTool(canvas);
	}

	public void draw() {
		// Draw circle
		pencil.up();
		pencil.move(150, 0);
		pencil.down();
		pencil.setColor(RED);
		pencil.setWidth(15);
		pencil.fillCircle(100);
	}

	public void inventory11() {
		pencil.up();
		pencil.move(0, 300);
		pencil.down();
		pencil.setColor(RED);
		pencil.setWidth(15);
		pencil.fillCircle(100);
	}

	public static void main(String args[]) {
		SquareAndCircle c = new SquareAndCircle();
		c.draw();
		c.inventory11();
	}
	public void drawStorage(Storage a){
	}

}
