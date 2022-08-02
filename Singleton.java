package singleton;

public class Singleton {

	private static Singleton single_instance=null;
	public String s;
	
	private Singleton()
	{
		s="Hallo I am a String";
		
	}
	public static Singleton Singleton()
	{
		if(single_instance==null)
		{
			single_instance=new Singleton();
		}
		return single_instance;
	}
			
}

class singleton1
{
	public static void main(String[] args)
	{
		Singleton x=Singleton.Singleton();
		Singleton y=Singleton.Singleton();
		Singleton z=Singleton.Singleton();
		
		x.s=(x.s).toUpperCase();
		System.out.println("String form x is"+x.s);
		System.out.println("String form y is"+y.s);
		System.out.println("String form z is"+z.s);
		
		z.s=(z.s).toLowerCase();
		System.out.println("\nString form x is"+x.s);
		System.out.println("String form y is"+y.s);
		System.out.println("String form z is"+z.s);
	}
}