import java.util.Scanner;



public class exp9A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program runs perfectly after exception");

        sc.close();
    }
}
