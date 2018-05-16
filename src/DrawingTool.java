import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DrawingTool {

	public static void main(String[] args) throws Exception {
		System.out.println("Drawing tool starting");
		File fileOutput = new File("src/output.txt");
        if (fileOutput.exists()){  
        		fileOutput.delete();
        }
		String filenameInput = "src/input.txt"; 
		File fileInput = new File(filenameInput);  
        if (!fileInput.exists()){  
        		throw new Exception("File input.txt not found.");
        }
        System.out.println("Reading commands on the file input.txt");
        Path p = Paths.get(filenameInput);
		List<String> commands = Files.readAllLines(p);
		Canvas canvas = new Canvas(0, 0);
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		char color = ' ';
		int index = 0;
		for (String command : commands) {
            System.out.println("Executing command: " + command);
            String[] commandSplitted = command.split(" ");
            if (index == 0 && !commandSplitted[0].equals("C")) {
            		throw new Exception("Canvas must be the first command to drawing tool.");
            }
            switch (commandSplitted[0]) {
			case "C":
				int width = Integer.parseInt(commandSplitted[1]);
				int height = Integer.parseInt(commandSplitted[2]);
				canvas = new Canvas(width, height);
				canvas.print();
				break;
			case "L":
				x1 = Integer.parseInt(commandSplitted[1]);
				y1 = Integer.parseInt(commandSplitted[2]);
				x2 = Integer.parseInt(commandSplitted[3]);
				y2 = Integer.parseInt(commandSplitted[4]);
				Line.fill(canvas, x1, y1, x2, y2, true);
				break;
			case "R":
				x1 = Integer.parseInt(commandSplitted[1]);
				y1 = Integer.parseInt(commandSplitted[2]);
				x2 = Integer.parseInt(commandSplitted[3]);
				y2 = Integer.parseInt(commandSplitted[4]);
				Rectangle.fill(canvas, x1, y1, x2, y2, true);
				break;
			case "B":
				x1 = Integer.parseInt(commandSplitted[1]);
				y1 = Integer.parseInt(commandSplitted[2]);
				color = commandSplitted[3].toCharArray()[0];
				BucketFill.fill(canvas, x1, y1, color, true);
				break;
			default:
				break;
			}
            index++;
		}
		System.out.println("File output.txt created");
		System.out.println("Drawing tool finished");
	}

}
