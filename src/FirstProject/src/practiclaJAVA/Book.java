package practiclaJAVA;

public class Book 
{
	Book()
	   {
		   System.out.println("Default Constructor");
	   }
   int bookId;
   String bookName;
   double price;
   Book(int bookId, String bookName,double price)
   {
	   this.bookId = bookId;
	   this.bookName = bookName;
	   this.price = price;
   }
   void display()
   {
	   System.out.println("BookID:"+ bookId);
	   System.out.println("BookName:" + bookName );
	   System.out.println("Bookprice:"+ price);
   }
   public static void main(String[] args) {
	   Book b1 = new Book();
	   b1.display();
	   System.out.println();
	   Book b2= new Book(123,"Mathes",568.25);
	   b2.display();
	   
	   
}
   
}
