package encapsulation;
public class Student 
{
  String name;
  int marks;
  void setDetails(String name, int marks)
  {
	  this.name = name;
	  this.marks = marks;
  }
  boolean isPassed()
  {
	  if(marks>=35)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
  public static void main(String[] args) {
	  Student s1= new Student ();
	  s1.setDetails("Rudra", 85);
	  boolean result = s1.isPassed();
	  System.out.println(result);
	  
}
}
