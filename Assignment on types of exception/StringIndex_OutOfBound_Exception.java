
package assignment;


public class StringIndex_OutOfBound_Exception {
    
	public static void main(String args[]) 
	{ 
		try { 
			String str = "Here i am. "; // length is 22 
			char c = str.charAt(20); // accessing 25th element 
			System.out.println(c); 
		} 
		catch(StringIndexOutOfBoundsException y) { 
			System.out.println("StringIndexOutOfBoundsException"); 
		} 
	} 
} 






