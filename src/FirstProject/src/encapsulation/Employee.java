package encapsulation;

public class Employee 
{
   private int empid;
   private String name;
   private int salary;
   public int getEmpid() {
	return empid;
   }
   public String getName() {
	return name;
   }
   public int getSalary() {
	return salary;
   }
   public void setEmpid(int empid) {
	this.empid = empid;
   }
   public void setName(String name) {
	this.name = name;
   }
   public void setSalary(int salary) {
	this.salary = salary;
   }
   public static void main(String[] args) 
   {
	   Employee a1 = new Employee();
	   a1.setEmpid(101);
	   a1.setName("Geeta");
	   a1.setSalary(70000);
	   System.out.println(a1.getEmpid());
	   System.out.println(a1.getName());
	   System.out.println(a1.getSalary());
}
   
}
