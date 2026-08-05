class shape{
    void getPerimeter(){
        System.out.println("This is parent Class");
    }
    void getArea(){
        
    }
}

class circle extends shape{

    double getPerimeter(Float radius){
        return 2*Math.PI*radius;
    }
}



public class S3_2 {
    public static void main(String[] args){
        circle c = new circle();
        shape s = new shape();
        System.out.println(c.getPerimeter(7f));
        s.getPerimeter();
    }
}
