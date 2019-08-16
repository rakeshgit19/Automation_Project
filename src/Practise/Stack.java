package Practise;

public class Stack 
{

	public static void main(String[] args) 
	{
		
		java.util.Stack s = new java.util.Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s);
		System.out.println(s.search("b"));
		System.out.println(s.search("x"));
		

	}

}
