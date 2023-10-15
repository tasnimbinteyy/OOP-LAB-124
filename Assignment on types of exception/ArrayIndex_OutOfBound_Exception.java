
package assignment;


public class ArrayIndex_OutOfBound_Exception {
  
	public static void main(String args[]) 
	{ 
		try{ 
			int arr[] = new int[20]; 
			arr[57] = 9; 
		} 
		catch(ArrayIndexOutOfBoundsException u){ 
			System.out.println ("Array Index is Out Of Bounds"); 
		} 
	} 
} 


