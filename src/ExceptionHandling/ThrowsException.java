package ExceptionHandling;
import java.io.*;
public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadWrite  r = new ReadWrite();
		try {
			r.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
class ReadWrite{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/xyz.txt");
	}
	void SaveFile() throws FileNotFoundException
	{
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d/:xyz.txt"); 
	}
}