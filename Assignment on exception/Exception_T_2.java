package assignment;

import java.util.Scanner;

public class Exception_T_2   {
    void abc(int n)throws ArithmeticException
    {
        
        if (n%2 != 0) {
            
            throw new ArithmeticException("It is an odd number");
           }
        else
            System.out.println("It is an even number.");
         }
    
    
}




