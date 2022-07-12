package interfacepackage;

public interface sister 
{
	void mobile();
	default void bike()
	{
		System.out.println("this is my sister scooty");
		
	}
	 static void car() 
	 {
		 System.out.println("sisters car");
	 }
}
   
   
   
