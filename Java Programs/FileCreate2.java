//write(String str, int off, int len)//

import java.io.FileWriter;
import java.io.IOException;
class FileCreate2
{
	public static void main(String[] args)
	{
		String str="This is an example of Filewriter";
		try(FileWriter filewriter=new FileWriter("D:/File Handling/file2.txt"))
				{
					filewriter.write(str,0,31);
					System.out.println("File Written Successfully!");
				}catch(IOException e)
				{
					e.printStackTrace();
				}
	}
}