package practiclaJAVA;

public class Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a ="AutomationA23";
    boolean b1 = a.matches("A(.*)");
    System.out.println(b1);
    boolean b2 = a.matches(".*[0-9].*");
    System.out.println(b2);
    boolean b3= a.matches("^(.*)A");
    System.out.println(b3);
	}

}
