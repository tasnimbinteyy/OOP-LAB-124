
package assignment;

import java.util.Scanner;


public class Exception_T2_Main {
    public static void main(String[] args) {
        Exception_T_2 obj = new  Exception_T_2();
        
        Scanner input = new Scanner(System.in);
        
        int n;
        
        System.out.print("Enter the number:");
        n = input.nextInt();
       
        
        obj.abc(n);
        
        
    }
}







