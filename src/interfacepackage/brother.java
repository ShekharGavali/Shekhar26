package interfacepackage;

public interface brother
{
    void love();
    default void bike()
    {
    	System.out.println("this is my brothers bike");
    	
    }
    static void car()
    {
    	System.out.println("brothers car");
    }
    
}
