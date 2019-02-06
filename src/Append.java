import java.io.*;
import java.util.*;

public class Append {
	public void Append(String text) {
		try
        {
            String filename= "text.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(text);//appends the string to the file
            fw.close();
            System.out.println("Append done");
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
	}
}
