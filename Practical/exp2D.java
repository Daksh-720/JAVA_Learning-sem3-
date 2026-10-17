//Program 4: To display different datatypes
//Write a Java program to display the different primitive data types. 
//In a class named Datatypes, declare a byte (100), a short (2000), 
//an int (5000), a long (1234567890L), a float (12.5f), 
//a double (123.456), a char (‘A’) and a boolean (true), and display 
//each one in the format “Byte = <value>”, “Short = <value>”, “Int = <value>”, “Long = <value>”, 
// “Float = <value>”, “Double = <value>”, “Char = <value>” and “Boolean = <value>”.


class Datatypes{
    void display(){
         byte b = 100;
        short s = 2000;
        int i = 5000;
        long l = 1234567890L;
        float f = 12.5f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Char = " + c);
        System.out.println("Boolean = " + bool);
    }
}



public class exp2D {
    public static void main(String[] args){
        Datatypes d = new Datatypes();
        d.display();
    }
}
