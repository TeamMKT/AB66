package package2;
//Write a Java program where Vehicle is extended by Car and Bike to display different features.
public class Assignement81_Bike extends Assignment81_vehicle
{
  void displaybike()
  {
	  System.out.println("Bike has 2 wheels");
  }
  public static void main(String[] args) 
  {
	  Assignement81_Bike a1=new Assignement81_Bike();
	  a1.displaybike();
	  displayvehicle();
}
}
