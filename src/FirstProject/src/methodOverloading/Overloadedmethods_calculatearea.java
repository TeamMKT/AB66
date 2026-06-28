package methodOverloading;
//Create overloaded methods to calculate area: Square;Rectangle;Triangle.
public class Overloadedmethods_calculatearea {
     static void mul (int s)
     {
    	 int area_of_square=s*s;
    	 System.out.println(area_of_square);
     }
     static void mul (int l,double w)
     {
    	 double area_of_rectangle=l*w;
    	 System.out.println(area_of_rectangle);
     }
      static void mul (double b,double h)
     {
    	 double area_of_traingle=(b*h)/2.0;
    	 System.out.println(area_of_traingle);
     }
	public static void main(String[] args) {
	
		mul(15);
		mul(15,1.5);
		mul(1.25, 1.25);
		
		

	}

}
