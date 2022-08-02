package Exception;

import java.util.Scanner;

public class Airthematic {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		Airthematic ar=new Airthematic();
		ar.Calculate(n1,n2);
	}

	private void Calculate(int n1, int n2) 
	{
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		
	}

}
