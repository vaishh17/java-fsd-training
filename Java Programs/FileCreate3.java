//write(char[] cbuf, int off, int len)//

import java.io.FileWriter;
import java.io.IOException;
class FileCreate3
{
	public static void main(String[] args)
	{
		char[]cbuf="Banglore is a Beautiful City".toCharArray();
		try(FileWriter filewriter=new FileWriter("D:/File Handling/file3.txt"))
				{
					filewriter.write(cbuf,0,8);
					System.out.println("File Written Successfully!");
				}catch(IOException e)
				{
					e.printStackTrace();
				}
	}
}
