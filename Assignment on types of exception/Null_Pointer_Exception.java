
package assignment;


public class Null_Pointer_Exception {
   
    public static void main(String args[]) 
    { 
        try { 
            String str = null; //null value 
            System.out.println(str.charAt(0)); 
        } catch(NullPointerException z) { 
            System.out.println("Null Pointer Exception.."); 
        } 
    } 
}






