package this_Keyword;

public class Grade
{
  int marks;
  void setMarks(int marks)
  {
	  this. marks = marks;
  }
  char calculateGrade()
  {
	  if(marks>=90)
	  {
		  return 'A';
	  }
		 else if(marks>=75)
		  {
			  return 'B';
		  }
		  
		 else if(marks>=50)
			  {
				  return 'C';
			  }
			  else
			  {
				  return 'F';
			  }
		  }
  public static void main(String[] args) 
  {
	  Grade g1 = new Grade();
	  g1.setMarks(85);
	  char result = g1.calculateGrade();
	  System.out.println(result);
	  
}
}
