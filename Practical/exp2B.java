//Program 2: Explicit type casting
//Write a Java program to demonstrate explicit type casting.
//In a class named explicit, declare a double variable d with 
//the value 12.87 and cast it to an int variable num using (int). 
//Display both values in the format “double = <d>” and “integer = <num>”.




class explicit{
    void display(){
        int num = 10000;
        byte value = (byte) num;
        System.out.println("Int= "+ num);
        System.out.println("Byte= "+ value);
    }
}


public class exp2B {
    public static void main(String[] args){
        explicit e = new explicit();
        e.display();
    }
}
