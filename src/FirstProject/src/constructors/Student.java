package constructors;
public class Student
{
	String Name;
	   int Age;
   Student (String name, int age)
   {
	   this.Name= name;
	   this.Age = age;
	   
   }
   void display()
   {
	   System.out.println("Name is:"+ Name +" & "+ Age);

   }
   public static void main(String[] args) 
   {
	   Student a1= new Student("Rudra",18);
	   a1.display();
	   
	   
}
}
