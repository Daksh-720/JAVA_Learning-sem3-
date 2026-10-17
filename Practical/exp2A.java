//Write a Java program to demonstrate implicit type casting.
//In a class named implicit, declare an int variable num with
//the value 100 and assign it to a double variable value.
//Display both values in the format “integer = <num>” 
//and “double = <value>”.


class implicit{
    void display(){
        int num = 100;
        float value = num;
        System.out.println("Int= "+ num);
        System.out.println("Float= "+ value);
    }
}
class exp2A{
    public static void main(String[] args){
        implicit i = new implicit();
        i.display();
    }
}