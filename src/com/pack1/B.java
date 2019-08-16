package com.pack1;

public class B 
{
  static int noofobject = 0;
  public B()
	{
		noofobject += 1;
	}
	
  public static void main(String[] args) 
	{
		B b = new B();
		B b1 = new B();
		B b2 = new B();
		System.out.println(noofobject);
		
	}
	
	
	
}
