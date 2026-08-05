//Write a Java program to create a class called Shape with a method called getArea(). 
// Create a subclass called Rectangle that overrides the getArea()
//  method to calculate the area of a rectangle.

class shape2{
    double getArea(){
        return 0;
    }
}

class Rectangle extends shape2{

    double getArea(int length, int breadth){
        return length*breadth;
               
    }
}




public class S3_6 {
    public static void main(String[] args){

        Rectangle r = new Rectangle();
        System.out.println("Area of a rectangle is: " + r.getArea(4, 5));

    }
    
}
