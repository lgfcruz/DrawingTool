import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Canvas {
	
	static final char CV_EMPTY = ' ';
	static final char CV_BORDER_H = '-';
	static final char CV_BORDER_V = '|';
	static final char CV_LINE = 'x';
	
	private int width = 0;
	private int height = 0;
	private char[][] arr;
	private boolean newCanvas = false;
	
	public Canvas(int width, int height) {
		super();
		this.newCanvas = true;
		char charDefault = CV_EMPTY;
		char rowChar = CV_BORDER_H;
		char colChar = CV_BORDER_V;
		this.width = width;
		this.height = height;
		this.arr = new char[height+2][width+2];
		int i = 0;
		for (char[] row : this.arr) {
			if ((i == 0) || (i == height+1)) {
				Arrays.fill(row, rowChar);
			} else {
				Arrays.fill(row, charDefault);
				this.arr[i][0] = colChar;
				this.arr[i][width+1] = colChar;
			}
			i++;
		}
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public char[][] getArr() {
		return arr;
	}
	
	public void print() throws IOException {
		File file = new File("src/output.txt");
        if (!file.exists()){  
        		file.createNewFile();
        }
        FileOutputStream output = new FileOutputStream(file, !this.newCanvas);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(output));
		for (char[] row : this.arr) {
			for (char col : row) {
				bufferedWriter.write(col);
			}
			bufferedWriter.newLine();
		}
        bufferedWriter.close();
        output.close();
        
        this.newCanvas = false;
	}

}
