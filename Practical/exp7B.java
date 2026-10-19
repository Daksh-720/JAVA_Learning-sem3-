class Shape{
    void area(){
        System.out.println("Area of a shape");
    }
}

class circle extends Shape{
    @Override
    void area(){
        int r=5;
        System.out.println("Area of circle: "+(Math.PI*r*r));
    }
}

class rectangle extends Shape{
    @Override
    void area(){
        int l=10, b=5;
        System.out.println("Area of rectangle: "+(l*b));
    }
}



public class exp7B {
    public static void main(String[] args){
        Shape s;
        
        s = new circle();
        s.area();

        s = new rectangle();
        s.area();
    }
}
