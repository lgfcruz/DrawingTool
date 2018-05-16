import java.io.IOException;

public class Line {
	
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
		if (x1 == x2) {
			for (int j = y1; j <= y2; j++) {
				canvas.getArr()[j][x1] = Canvas.CV_LINE;
			}
		} else if (y1 == y2) {
			for (int i = x1; i <= x2; i++) {
				canvas.getArr()[y1][i] = Canvas.CV_LINE;
			}
		}
		if (print) canvas.print();
	}

}
