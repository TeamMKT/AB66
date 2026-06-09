package moduel3;
class Information
{
	private int age=10;//senstive
	private String emailId="nisha@gmail.com";
	
	public int getAge()   //getter
	{
		return age;
	}
	public void setAge(int age) //setter
	{
		this.age=age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
public class Mprogram 
{
	public static void main(String[] args) 
	{
		Information i1=new Information();
		i1.setAge(21);//you first set the value
		System.out.println(i1.getAge());//you fetched the value
	}
}
