import java.io.*;
import java.util.*;

public class Write {
	public void Write(String text) {
		FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
          fWriter = new FileWriter("text.txt");
          writer = new BufferedWriter(fWriter);
          writer.write(text);
          writer.newLine();
          writer.close();
          System.out.println("Input saved");
        } catch (Exception e) {
            System.out.println("Error!");
        }
	}
}
