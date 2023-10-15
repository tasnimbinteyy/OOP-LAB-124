
package assignment;


public class Illegal_State_Exception {
    public static void  print(int x,int y) 
     { 
         System.out.println("Addition of Positive Integers :"+(x+y)); 
     } 
      
    public static void main(String[] args) { 
    int n1=4; 
    int n2=-8; 
     if(n1>=0 && n2>=0) 
     { 
         Illegal_State_Exception.print(n1,n2); 
     } 
     else
     { 
         throw new IllegalStateException("Either one or two numbers are not Positive Integer"); 
     } 
    } 
}
