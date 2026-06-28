package package1;
//how to access static methods which is part of your different class? Classname.methodname();
public class M1 {
     void add(int a, int b)
     {
    	 System.out.println(a+b);
     }
	
	public static void main(String[] args) 
	{
		M2.add(250, 650);  //static method with different class thatis Classname.methodname();
		M1 m1=new M1();  //create an object
		m1.add(35, 45);  
		//referrancevariable with void method (in same class for nonstatic method to create an object and call with referrancevariable with methodname)
	    M2 m2=new M2();  //create an object for differnt class M2
	    m2.mul(65, 75);  //referrancevariable with void method (in different class for nonstatic method to create an object and call with referrancevariable with methodname)
		}
	

}
 