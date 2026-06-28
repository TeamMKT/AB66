package package1;
//Write a program to calculate electricity bill: Units ≤ 100 → ₹5/unit  ; Units > 100 → ₹10/unit
import java.util.Scanner;

public class ElectricitybillScanner_ifElse 
{

	public static void main(String[] args) 
	{
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter units");
        int units=S1.nextInt();
        int Billamount; //create variable
        if(units <= 100)
        {
        	Billamount=units * 5;	
        }
        else 
        {
        	Billamount=units * 10;
        }
        System.out.println("Electricity Bill = ₹" + Billamount);
        S1.close();
	}

}
