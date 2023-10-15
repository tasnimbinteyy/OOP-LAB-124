
package assignment;


public class Illegal_Argument_Exception {
    public static void print(int b)  
    { 
         if(b>=18){ 
          System.out.println("Eligible for Voting"); 
          } 
          else{ 
     
          throw new IllegalArgumentException("Not Eligible for Voting"); 
                                     
          } 
        
    } 
    public static void main(String[] args) { 
         Illegal_Argument_Exception .print(17);  
    } 
}
