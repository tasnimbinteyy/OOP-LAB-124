
package assignment;

import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 

public class File_notFound {
 
    public static void main(String args[]) { 
		try { 

			// Following file does not exist 
			File obj = new File("C://file.abc"); 

			FileReader abc = new FileReader(obj); 
		} catch (FileNotFoundException s) { 
		System.out.println("Can not find the file."); 
		} 
	} 
} 


