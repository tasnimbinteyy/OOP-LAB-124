
package OOP_LAB;

import java.util.Scanner;


public class Password_Validation {
     public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) 
    {
        //taking input the password
        System.out.print("Enter the Password: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); 
        
        //Calling the Valid_invalid mathod
        System.out.println(Valid_invalid(str));
             
    }
    public static String Valid_invalid(String str) 
    {
          //intialising the variables.
            int digitcount = 0;
            int digit = 2;
            int whitespace = 1;
            int whitespaceCount = 0;
            int specialcharacter = 0;
            int lettercount = 0;
            String result;
            
            //assigning the length of the string at length variable.
             int length = str.length();
            
             //Counting the number of digit,whitespace,letters
            for (int i = 0; i < length; i++) 
            {
              char c = str.charAt(i);
              int n = (int)c;
              
              if(Character.isDigit(c))
              {
                  digitcount++;
              }
              else if(Character.isWhitespace(c))
              {
                  whitespaceCount++;
              }
              else if(n>=33 && n<= 47 || n == 64)
              {
               specialcharacter++;
              }
              else if( Character.isLetter(c))
              {
                  lettercount++;
              }
              
               
            }
            
            //Checking the condition of the password
            if(lettercount >= 1 &&  digitcount>= 2 && whitespaceCount >= 1 
                    &&  length >= PASSWORD_LENGTH && specialcharacter == 0)               
              {
                  result =  " The password is valid. ";
              }
           
            else
            {
                result = " The password is invalid. ";
            }
            
            //returns the result of the method.
             return (result);
    
   }
}
    

