package encapsulation;

public class Test
{
    int Studentid;
    String Studentname;
    int Studentmarks;
	public int getStudentid() {
		return Studentid;
	}
	public String getStudentname() {
		return Studentname;
	}
	public int getStudentmarks() {
		return Studentmarks;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public void setStudentmarks(int studentmarks) {
		Studentmarks = studentmarks;
	}
    public static void main(String[] args) 
    {
    	Test t1 = new Test();
    	t1.setStudentid(101);
    	t1.setStudentname("Rudra");
    	t1.setStudentmarks(95);
    	System.out.println(t1.getStudentid());
    	System.out.println(t1.getStudentname());
    	System.out.println(t1.getStudentmarks());
    	
    	
	}
}
