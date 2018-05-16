import java.io.IOException;

public class BucketFill {
	
	public static void fill(Canvas canvas, int x, int y, char c) throws IOException {
		fill(canvas, x, y, c, false);
	}
	
	public static void fill(Canvas canvas, int x, int y, char c, boolean print) throws IOException {
		if (x <= 0 || x > canvas.getWidth() || y <= 0 || y > canvas.getHeight() || canvas.getArr()[y][x] != Canvas.CV_EMPTY) return;
		canvas.getArr()[y][x] = c;
		BucketFill.fill(canvas, x - 1, y, c);
		BucketFill.fill(canvas, x, y - 1, c);
		BucketFill.fill(canvas, x + 1, y, c);
		BucketFill.fill(canvas, x, y + 1, c);
		
		if (print) canvas.print();
	}

}
