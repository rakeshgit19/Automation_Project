public class ABC 
{
	static int noofobject = 0;
	public ABC()
	{
		noofobject += 1;
	}
	
	public static void main(String[] args)
	{
      ABC a = new ABC();	
      ABC a1 = new ABC();
      ABC a2 = new ABC();
      ABC a3 = new ABC();
      System.out.println(noofobject);
		
		  
		 
			

	}

}
