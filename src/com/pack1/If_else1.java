package com.pack1;

import java.util.Scanner;

public class If_else1 {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		for(int i=1;i<=6;i++)
		{
			System.out.println("enter marks") ;
			
		}
		int marks=x.nextInt();
		//int i =20;
		if(marks>=25)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

	}

}
