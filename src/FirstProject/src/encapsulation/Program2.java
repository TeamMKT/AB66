package encapsulation;

public class Program2 
{
  private String emailId = "geeta.meduri@gmail.com";

  public String getEmailId() 
  {
	return emailId;
  }

  public void setEmailId(String emailId) 
  {
	this.emailId = emailId;
  }
  public static void main(String[] args)
  {
	  Program2 a1 = new Program2();
	  a1.setEmailId("geeta.meduri@gmail.com");
	  System.out.println(a1.getEmailId());
}
}
