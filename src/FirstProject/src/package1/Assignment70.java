package package1;
import java.util.Scanner;
/*"Write a program using nested if and scanner class 
a. Check if marks are valid (0–100)
b. marks above 90 then check math and science should above 90 then A+ 
c. marks above 90 then check if math and science below 90 then A
d. marks above 80 and below 90 then check math and science should above 80 then B+
e. marks above 80 and below 90 then check if math and science below 80 then B"*/
public class Assignment70 
{
  public static void main(String[] args) 
  {
	Scanner s1 =new Scanner(System.in);
    System.out.println("Enter marks");
     int marks = s1.nextInt();
     System.out.println("Enter  math marks");
     int math = s1.nextInt();
     System.out.println("Enter  science marks");
     int science=s1.nextInt();
     if(marks>=0 && marks<=100)
     {
    	 System.out.println("Valid marks");
    	 if(marks>=90)
    	 {
    		 if(math>=90&&science>=90)
    		 {
    			 System.out.println("Grade A+");
    		 }
    		 else
    		 {
    			 System.out.println("Grade A");
    		 }
    	 }
    			 else if(marks>=80&&marks<=90)
    			 {
    				 if(math<90 && science<90)
    				 {
    					 System.out.println("Grade B+");
    				 }
    				 else
    				 {
    					 System.out.println("grade B");
    				 }
    			 }
    				 else if (marks>=80 && marks<=90)
    					 {
    						 if(math>80 && science>80)
    	    				 {
    	    					 System.out.println("Grade B+");
    	    				 }
    						 else
    						 {
    							 System.out.println("Grade B");
    						 }
    					 }
    				 else
    				 {
    					 System.out.println("no grade");
    				 }
     }
      else
    	 {
    		 System.out.println("invalid marks");
    	 }
     s1.close();
     } 
}



