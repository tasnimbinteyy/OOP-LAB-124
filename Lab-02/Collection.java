package OOP_LAB;

//importing the LinkedList class
 import java.util.LinkedList;

public class Collection {
     //Creating an LinkedList object
   public LinkedList < Book > CollectionOfBooks = new LinkedList < Book > ();
  
     //adding element in the LinkedList.
   public void addBook(Book book) 
     {
         CollectionOfBooks.add(book);
     }
  
    //removing element in the LinkedList.
   public void removeBook(Book book) 
     {
          CollectionOfBooks.remove(book);
     }
  
    //Returns the LinkedList to the main class.
    public LinkedList < Book > getBooks() 
     {
          return CollectionOfBooks;
     }
}
