package Stringfunctions;
/*Write a program whereInput is "Manish Kumar tiwari" Output
M
K
T*/
public class Assignment159
{
    public static void main(String[] args) 
    {
    	String s1 = "Manish Kumar tiwari";
        
        String [ ] s2 = s1.split(" ");
        
        for(int i=0;i<s2.length;i++)
        {
        	System.out.println(s2[i].charAt(0));
        }
	}
}
