package lang_package;

public class ExcDemo {
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
		Process p = null;
		try {
		p=r.exec("notapad");
		
		}catch(Exception e) {
		System.out.println("error exceuting notepad");
	}

}}

