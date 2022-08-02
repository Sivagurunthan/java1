package FileWrite;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		try
		{
			FileWriter a=new FileWriter("D:\\ReadMe.txt");
			a.write("File in Java might be try,but it is fun enough");
			a.close();
			System.out.println("Successfully Wrote the file.");
		}catch(IOException b) {
			System.out.println("An error Occur.");
			b.printStackTrace();
		}
	
	}

}
