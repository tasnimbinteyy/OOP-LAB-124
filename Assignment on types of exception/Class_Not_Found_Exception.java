package assignment;


public class Class_Not_Found_Exception {
   

	public static void main(String[] args) { 
		try{ 
			Class.forName("Class9"); 
		} 
		catch(ClassNotFoundException u){ 
			System.out.println(u); 
			System.out.println("Class not found"); 
		} 
	} 
}

    

