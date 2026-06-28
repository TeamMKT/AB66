package practiclaJAVA;
  class Animal_Sound
  {
	 void sound()
	 {
		 System.out.println("Animal Sounds:");
	 }
	 
  }
  public class CatSound extends Animal_Sound
  {
     void sound()
     {
    	 System.out.println("Cat sound Meow");
     }
     public static void main(String[] args) 
     {
    	 Animal_Sound a1 = new CatSound();
    			 a1.sound();
    			 //it overrides parent class
    			 
	}
     

	
  
}
