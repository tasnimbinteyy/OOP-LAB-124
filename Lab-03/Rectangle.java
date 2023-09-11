package OOP_LAB;
import java.util.Scanner;

//Extending the Shape class thru the Rectangle class
public class Rectangle extends Shape {
  
    //Calculating the area of the Rectangle.
    public double area(double length,double width)
    {
          
        double Area = length*width;
        return Area;
    }
    //Calculating the perimeter of the Rectangle.
    public double perimeter(double length,double width)
    {
                   
           double Perimeter = 2 * (length + width);
           return Perimeter;
    }
    
    //Main method
    public static void main(String[] args) {
        //Created the object of the Rectangle class.
         Rectangle obj = new Rectangle();
      
    System.out.println("Area of the rectangle:" +obj.area(6.567,3.478));
    System.out.println("Perimeter of the rectangle:" +obj.perimeter(6.57,3.47));
    
    
   }
}




