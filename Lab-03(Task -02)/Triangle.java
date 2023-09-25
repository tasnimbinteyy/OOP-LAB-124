package labreport;
import java.util.Scanner;
  
  /*
  Created a class named Triangle which 
  implements the Shape class.
  */
  class Triangle implements Shape
   {
    //Calculating the area of the triangle in the getArea() method   
      public double getArea()
    {
        Scanner input = new Scanner(System.in);
        double length,width,result;
        
        System.out.print("Enter the length:");
        length = input.nextDouble();
        
        System.out.print("Enter the width:");
        width = input.nextDouble();
        
        result =0.5 *length *width;
        return (result);
    }
   }
    //Displays the result of the program.
 class Display {
    public static void main(String[] args) {
       
       //Created the object of the Triangle class.
       Triangle obj = new Triangle();
       //Called the getArea() method.
       System.out.println("Area = " +obj.getArea());
       
    }
}


