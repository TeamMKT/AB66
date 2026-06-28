package practise_Questions;
//Write a program with two non-static parameterized methods:One method to print employee name;One method to print employee salary
public class nonstatic_parametrized {
 void employeeinfo(String name)
 {
	 String Name=name;
	 System.out.println(Name);
 }
 void employeeinfo(int a)
 {
	 int c = a;
	 System.out.println(c);
 }
	public static void main(String[] args) {
		nonstatic_parametrized n1 = new nonstatic_parametrized();
			n1.	employeeinfo("Vineela");
			n1.employeeinfo(25000);

	}

}
