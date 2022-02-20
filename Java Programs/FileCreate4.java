//write(char[] cbuf)//

import java.io.FileWriter;
import java.io.IOException;
class FileCreate4
{
	public static void main(String[] args)
	{
		char[]cbuf="What a day it was!".toCharArray();
		try(FileWriter filewriter=new FileWriter("D:/File Handling/file4.txt"))
		{
			filewriter.write(cbuf);
			System.out.println("File Successfully Written!");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}