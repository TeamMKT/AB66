package package2;
////what happens within the class about Access specifiers?

public class AssessspecifiersforInstancevarible 
{
    public int a=10;
    protected int b=15;
    int c=20;
    private int d=25;
     
    public static void main(String[] args) 
    {
    	AssessspecifiersforInstancevarible a1=new AssessspecifiersforInstancevarible();
    	System.out.println(a1.a);
    	System.out.println(a1.b);
    	System.out.println(a1.c);
    	System.out.println(a1.d);
    	
    	
	}

   
}