package LogicPrograming;

import java.util.Scanner;

public class VowelorNot 
{

	public static void main(String[] args) 
	{
		char[] c;
		char[] ch = {'A','a','E','e','I','i','O','o','U','u'};
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an alphabet");
		ch = scan.next().toCharArray();
		c = ch;
		if(ch==c)
		{
			System.out.println("its a vowel");
		}
		else 
		{
		 
		System.out.println("its not a vowel");	
		}

	}

}
