
package assignment;


public class Arithmetic_Exception {


    public static void main(String args[]) 
    { 
        try { 
            int m = 3, n = 0; 
            
            int result = m/n;  
            System.out.println ("Result = " + result); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("Arithmetic Exception.");
            System.out.println ("Can not divide a number by 0." ); 
        } 
    } 
} 







