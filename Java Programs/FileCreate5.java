//write(String str)//

import java.io.FileWriter;
import java.io.IOException;
class FileCreate5
{
	public static void main(String[] args)
	{
		try(FileWriter f=new FileWriter("D:/File Handling/file5.txt"))
		{
			f.write("Today is Tuesday");
			System.out.println("File Written!");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}