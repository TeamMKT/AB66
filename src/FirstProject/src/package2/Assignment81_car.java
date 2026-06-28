package package2;
//Write a Java program where Vehicle is extended by Car and Bike to display different features.
public class Assignment81_car extends Assignment81_vehicle
{
  void displaycar()
  {
	  System.out.println("Car has 4 wheels");
  }
  public static void main(String[] args) 
  {
	  Assignment81_car a1=new Assignment81_car();
	  a1.displaycar();
	  displayvehicle();
	  
}

}
