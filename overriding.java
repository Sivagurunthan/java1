package overriding;

class super_class
{
	int b;
	super_class(int b)
	{
		this.b=(b+10);
	}
	public void display()
	{
		System.out.println("vlaue of B:"+b);
	}
}
class sub_class extends super_class
{
	int a;
	sub_class(int a,int b)
	{
		super(b);
		this.a=a;
	}
	public void dispaly()
	{
		System.out.println("Sub class:");
		System.out.println("vlaue of A:"+a);
		System.out.println("vlaue of B:"+b);
	}
}
public class overriding {

	public static void main(String[] args)
	{
		sub_class a=new sub_class(10,20);
		a.dispaly();
		
		
	}

}
