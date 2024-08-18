import java.io.*;

public class shutdown 
{
	public static void main(String[] args)
	{
		Runtime run= Runtime.getRuntime();
		
		try
		{
			System.out.println("Shutting down your laptop after 5 secs.");
			run.exec("shutdown -s -t 5");
		}
		
		catch(IOException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}
