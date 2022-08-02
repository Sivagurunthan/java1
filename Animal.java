package sample;

 abstract class Animal 
{
	public abstract void animalsound();
	public void sleep()
	{
		System.out.println("Zzz");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pig sys:wee wee");
		
	}
}
class Main
{
	public static void main(String[] args)
	{
		Pig myPig=new Pig();
		myPig.animalsound();
		myPig.sleep();
	}
}