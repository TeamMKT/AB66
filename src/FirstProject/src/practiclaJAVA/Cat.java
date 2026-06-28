package practiclaJAVA;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Animal22
{
 public void sound()
 {
     System.out.println("Animal Sounds");
 }
}
 class Cat extends Animal22
{
 public void sound()
 {
     System.out.println("Cat sounds Meow");
 }
public static void main(String[] args) 
{
     Animal22 a1 = new Cat();
     a1.sound();
 }
}


	

	


