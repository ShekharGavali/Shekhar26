package interfacepackage;

public class BigBrother implements sister,brother {

	public static void main(String[] args)
	{
	BigBrother bb=new BigBrother();
	bb.bike();
	
	bb.mobile();
	bb.love();
	
    brother.car();
    sister.car();
	}
 
// no use override for default method ,simply calling done by object creation
	
	

  @Override
public void bike() {
	// TODO Auto-generated method stub
	brother.super.bike();
	sister.super.bike();
	
}
  @Override
public void love() 
  {
	System.out.println("this is brorhers love");
	
}
  @Override
public void mobile()
  {  
	System.out.println("this is sisters mobile");
	
}
}
