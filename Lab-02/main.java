package OOP_LAB;
public class main {
    
    public static void main(String[] args) {
            //Creating the object of Collection class 
        Collection obj = new Collection();
        
            //Creating the object of Book class.       
         Book book1 = new Book("Integral Calculus", "B.C.Das & B.N.Mukherjee ","81-85624-91-7");
         Book book2 = new Book("Programing with C", "Byron Gottfried","0-07-014590-3");
         Book book3 = new Book("Electric Circuits", "Charles Alexander & Matthew Sadiku","978-1-260-57079-3");
            
           
           /* Adding the value of the attributes in
            the LinkedList used in collectin class */
         obj.addBook(book1);
         obj.addBook(book2);
         obj.addBook(book3);
         
         
         //Displays the list of the given books.
          System.out.println("Given Books are:");
       
          /*
           Using for loop to display the attributes 
           of the books in a sequence until it reaches 
           the last book in the collection.
          */
         for (Book a: obj.getBooks())
        {
            
         System.out.println( "Title of the book:" +a.getTitle());
         System.out.println("Author of the book: " +a.getAuthor());
         System.out.println("ISBN of the book:" +a.getISBN());
         System.out.println(" ");
        
        }
         
           //Removing a book from the collection.
            obj.removeBook(book2);
          
           /*
           Displays the books which are remaind 
           after removing the particular book
           */
         System.out.println("After removing " + book2.getTitle() + " remaining books are:");
         System.out.println(" ");
           
          /*
           Using for loop to display the attributes 
           of the books in a sequence until it reaches 
           the last book in the collection.
          */
           
        for (Book d: obj.getBooks())
        {
        
         System.out.println( "Title of the book:" +d.getTitle());
         System.out.println("Author of the book: " +d.getAuthor());
         System.out.println("ISBN of the book:" +d.getISBN());
         System.out.println(" ");
      
         }
     }
    }
   
    

