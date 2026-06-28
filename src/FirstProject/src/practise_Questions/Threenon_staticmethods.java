package practise_Questions;
//Create a class with three non-static methods:displayName();displayAge();displayCity()
public class Threenon_staticmethods {
   void displayname()
   {
	   System.out.println("Rudra");
   }
   void displayage()
   {
	   System.out.println(18);
   }
   void displaycity()
   {
	   System.out.println("Visakhapatnam");
   }
	public static void main(String[] args) {
		Threenon_staticmethods m1 = new Threenon_staticmethods();
		m1.displayname();
		m1.displayage();
		m1.displaycity();

	}

}
