package sample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try 
		{
			File a=new File("D:\\ReadMe.txt");
			Scanner myReader=new Scanner(a);
			while(myReader.hasNextLine())
			{
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}catch(FileNotFoundException c) {
			System.out.println("An error occurred");
			c.printStackTrace();
		}

	}

}
