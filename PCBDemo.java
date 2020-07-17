package lang_package;

public class PCBDemo {
	public static void main(String args[])
	{
		try {
			ProcessBuilder proc =
			new ProcessBuilder("notepad.exe", "testfile");
			
			
		}
		catch(Exception e)
		{
			System.out.println("error excuting notepad");
		
		}
	}

}
