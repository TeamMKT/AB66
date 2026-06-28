package practise_Questions;
//Create a class with non-static methods to calculate:Area of triangle; Perimeter of rectangle
public class Nonstatic_traingle {
   void mul()
  {
	    int base = 6;
	    int height = 10;
	    int area_of_traingle = (base*height)/2;
		System.out.println(area_of_traingle);	
  }
   void multiply()
   {
 	    int width = 6;
 	    int length = 10;
 	    int permieter_of_rectangle = length * width;
 	   System.out.println(permieter_of_rectangle);
 			
   }
	public static void main(String[] args) {
		Nonstatic_traingle n1=new Nonstatic_traingle();
		n1.mul();
		n1.multiply();


	}

}
