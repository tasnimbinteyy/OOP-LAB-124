
package assignment;

import java.util.Scanner;


public class IO_Exception {
     public static void main(String[] args) 
    { 
  
        
        Scanner obj = new Scanner("Chittagong"); 
  
       
        System.out.println("" + obj.nextLine()); 
  
        // Check if there is an IO exception 
        System.out.println("Exception Output: " + obj.ioException()); 
  
        obj.close(); 
    } 
}





