package encapsulation;
public class Ticket 
{
 int age;
 
 public int getAge() {
	return age;
}
 void setAge(int age)
 {
	this.age = age;
 }
 String getTicketType()
 {
	 if(age<=5)
	 {
		 return "Free Ticket";
	 }
	 else if(age<=18)
	 {
		 return "Child Ticket";
	 }
	 else if (age<=60)
	 {
		 return "Adult Ticket";
	 }
	 else
	 {
		 return "Senior ticket";
	 }
 }
 public static void main(String[] args) 
 {
	 Ticket t = new Ticket();
	 t.setAge(12);
	 String result = t.getTicketType();
	 System.out.println(result);
}
}
