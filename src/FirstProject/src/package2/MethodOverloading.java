package package2;

public class MethodOverloading {

	static void add()
	{
		System.out.println("Addition1");
	}
    static void add(int a)
    {
    System.out.println("Addition2"); 
    //creating with the samename(i.e samename is 'add') so, we can variation in the differnt arguments list. otherwise it shows compilation error.
    }

       public static void main(String[] args)
       {
		add();
		add(2);
	}


}
