package Stringfunctions;
public class String_Arrays1 
{
	public static void main(String[] args)
	{
		String a = "Automation";
		boolean b1 = a.matches("A(.*)");
		boolean b2 = a.matches("(.*)n");
		String url = "https://www.amazon.in/gp/product/B0FQFBHQMJ/ref=ox_sc_act_title_1?smid=AJ6SIZC8YQDZX&th=1";
		boolean b3=url.matches("(.*)product(.*)");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        String b ="auto";
        boolean b4 = b.matches("....");
        System.out.println(b4);
	}

}
