import java.io.IOException;

public class Rectangle {
	
	public static void fill(Canvas canvas, int x1, int y1, int x2, int y2) throws IOException {
		fill(canvas, x1, y1, x2, y2, false);
	}
	
	public static void fill(Canvas canvas, int x1, int y1, int x2, int y2, boolean print) throws IOException {
		if (x1 <= 0) {
			x1 = 1;
		}
		if (y1 <= 0) {
			y1 = 1;
		}
		if (x2 > canvas.getWidth()) {
			x2 = canvas.getWidth();
		}
		if (y2 > canvas.getHeight()) {
			y2 = canvas.getHeight();
		}
		for (int j = y1; j <= y2; j++) {
			for (int i = x1; i <= x2; i++) {
				canvas.getArr()[j][i] = Canvas.CV_EMPTY;
			}
		}
		Line.fill(canvas, x1, y1, x2, y1);
		Line.fill(canvas, x1, y2, x2, y2);
		Line.fill(canvas, x1, y1, x1, y2);
		Line.fill(canvas, x2, y1, x2, y2);
		
		if (print) canvas.print();
	}

}
