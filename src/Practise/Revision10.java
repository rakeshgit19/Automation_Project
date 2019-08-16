package Practise;

import java.util.ArrayList;

public class Revision10 
{

	public static void main(String[] args) 
	{
		
		ArrayList l = new ArrayList();
		l.add("black");
		l.add("red");
		l.add("green");
		l.add("pink");
		l.add("white");
		System.out.println(l);
		l.remove(1);
		l.add(0,"red");
		
		System.out.println(l);

	}

}
