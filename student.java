package Array;

import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Array Elements");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Matrix: \n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

}
