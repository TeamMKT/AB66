package collection;

import java.util.ArrayList;

public class Practice 
{
  public static void main(String[] args) 
  {
	  ArrayList <String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Before insert: ->" + cars);
		cars.add(0, "Maruthi Zen");
		System.out.println("After insert: ->"+ cars);
		Boolean b1 =cars.remove("BMW");
	System.out.println(b1);
	System.out.println("After removal: "+ cars);
}
}
