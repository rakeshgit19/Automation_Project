package Practise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap 
{

	public static void main(String[] args) 
	{
		
		HashMap m = new HashMap<>();
		m.put("chiranjeevi",700);
		m.put("balaiah",800);
		m.put("venkatesh",200);
		m.put("nagarjuna",500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi", 1000));
		
		//to print only value
		Set s = m.keySet();
		System.out.println(s);
		
		//to print only key of respective value
		Collection c = m.values();
		System.out.println(c);
		
		//to print both key and value
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		//to print respective key value pair individually
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if (m1.getKey().equals("nagarjuna")) 
			{
			
				m1.setValue(10000);
			}
		}
		System.out.println(m);

	}

}
