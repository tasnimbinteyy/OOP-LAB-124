
package assignment;


public class Number_Format_Exception {
    
	public static void main(String args[]) 
	{ 
		try { 
			
			float n = Integer.parseInt ("USTC") ; 

			System.out.println(n); 
		} catch(NumberFormatException t) { 
			System.out.println("Number format exception"); 
		} 
	} 
} 


