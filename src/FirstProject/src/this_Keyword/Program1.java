package this_Keyword;

public class Program1 
{
    int id;
    String name;
    Program1 (int id, String name)
    {
    	this.id = id;
    	this.name= name;
    }
    void disply()
    {
    	System.out.println("Id:"+ id);
    	System.out.println("Name:" + name);
    }
    public static void main(String[] args) 
    {
    	Program1 p = new Program1(19,"Rudra");
    	p.disply();
	}
    
}
