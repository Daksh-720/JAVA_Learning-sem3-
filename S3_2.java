class shape{
    void getPerimeter(){
        System.out.print("Values not assigned");
    }

    void getArea(){
        System.out.print("Values not assigned");
    }
}

class Circle extends shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void getArea() {
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle: " + area);
    }



    @Override
    void getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        System.out.print("Perimeter of a Circle is: " + perimeter);
    }
}



public class S3_2 {
    public static void main(String[] args){
        Circle obj = new Circle(5);
        obj.getArea();
        obj.getPerimeter();
    }
}
