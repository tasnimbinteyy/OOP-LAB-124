// Write a Java program that throws an exception and catch it using a try-catch block
package assignment;

public class Exception {
    public static void main(String[] args) throws ArithmeticException {
        int i = 4;
        int j = 20;
        
       
        try{
             int result = i/j;
             
             if (result == 0) {
                throw new ArithmeticException("Cant divide i by j.");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
           
            
        }
            
            System.out.println("Dividing j by i");
            
            int result = j/i;
            System.out.println(result);
    }
}




