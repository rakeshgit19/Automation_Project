package Practise;

import java.util.LinkedList;

public class Linkedlist 
{

	public static void main(String[] args) 
	{
		
		LinkedList l = new LinkedList();
		l.add("chandan");
		l.add("pooja");
		l.add("milan");
		l.add("don");
		l.add("simlan");
		l.add("leylan");
		l.add("saajan");
		l.add("sohan");
		l.add("rohan");
		l.add("lipsan");
		l.add("layan");
		System.out.println(l);
		l.set(0, "jilan");
		//System.out.println(l);
		l.addFirst("pooja");
		l.removeLast();
		l.removeFirst();
		System.out.println(l);
		

	}

}
