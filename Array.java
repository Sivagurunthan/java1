package Array1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array length:");
		int Count=s.nextInt();
		int[] total = new int[Count];
		int i=0;
		while(i<Count)
		{
			System.out.println("Enter number:");
			total[i]=s.nextInt();
			i++;
		}
		for(i=0;i<Count;i++)
		{
			System.out.println("Total is"+total[i]);
		}

	}

}
