package LogicPrograming;

import java.util.Iterator;
import java.util.Set;

public class DuplicateCharacterInString 
{

	public static void main(String[] args) 
	{
		String s =  "hgjvjvjkjjjjjgvj." ;
	    
		char[] ch = s.toCharArray();
		
		for (int i =0;i<ch.length;i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
			
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					
					break;
				}
			}
		}
		

	}

}
