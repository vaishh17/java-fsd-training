//Using flush()//

import java.io.FileWriter;
import java.io.IOException;
class FileCreate6
{
	public static void main(String[] args)
	{
		try(FileWriter f=new FileWriter("D:/File Handling/file6.txt"))
		{
			f.write("Happy");
			f.flush();
			f.write(" ");
			f.flush();
			f.write("February !");
			f.flush();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}