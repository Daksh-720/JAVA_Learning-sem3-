import java.util.Scanner;


class add{
    void addNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        int sum = n1+n2;
        System.out.println("Sum= "+ sum);
        sc.close();
    }
}

public class exp2C {
public static void main(String[] args){
        add a = new add();
        a.addNumbers();
    }    
}
