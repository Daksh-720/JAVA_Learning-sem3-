class circle{
    private double radius;

    void setRadius(double radius){
        this.radius = radius;

    }

    double getRadius(){
        return radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }

    double circumference(){
        return 2*Math.PI*radius;
    }
}



public class S3_7 {
    public static void main(String[] args){

        circle c = new circle();
        c.setRadius(5);
        c.getRadius();

        System.out.println("Area of a circle is: "+ c.area());
        System.out.println("Circumference of a circle is: "+ c.circumference());

    }
}
