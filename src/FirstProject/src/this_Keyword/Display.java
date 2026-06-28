package this_Keyword;

public class Display 
{
    
    void display()
    {
    	System.out.println("Display method");
    }
    void show()
    {
    	this.display();
    	System.out.println("Show method");
    }
    public static void main(String[] args)
    {
    	Display d = new Display();
    	d.show();
	}
    
}
