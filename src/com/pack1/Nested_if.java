package com.pack1;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		for(int i=1;i<=20;i++)
		{
			System.out.println("enter marks");
			int num=s.nextInt();
		
		if(num <100) 
		{
		 System.out.println("it is a small no");
		}
		else if(num>=100 && num<=150)
		{
			System.out.println("it is a medium no");
		}
		else if (num>=150)
		{
			System.out.println("it is a big no");
		}
		else
		{
			System.out.println("it is a negative no");
		}}
	}
	
	
		

}
