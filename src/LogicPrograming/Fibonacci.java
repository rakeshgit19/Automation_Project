package LogicPrograming;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int num,a=0,b=0,c=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of times");
		num=scan.nextInt();
		System.out.println("fibonacci series of number is");
		for(int i = 0;i<=num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(+a);
		}

	}

}
