package practiclaJAVA;
class Animal_14
{
	Animal_14()
	{
		System.out.println("Animal constructor");
	}
}
class Dog_14 extends Animal_14
{
	Dog_14()
	{
		System.out.println("Dog constructor");
	}
}
public class BabyDog extends Dog_14
{
    BabyDog()
    {
    	System.out.println("Baby dog constructor");
    }
    public static void main(String[] args) 
    {
    	BabyDog obj = new BabyDog();
	}
}
