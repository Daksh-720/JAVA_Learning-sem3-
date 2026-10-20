import java.util.Scanner;



class NotPerfectSquareException extends RuntimeException{
    NotPerfectSquareException(String s){
        super(s);
    }
}



public class exp10B {
    static void checkSquare(int s){
        if(s<=0){
            System.out.println("Square cannot be negative or zero");
        }

        int root = (int) Math.sqrt(s);

        if(root * root != s){
            throw new NotPerfectSquareException("Not a perfect square");
        }

        System.out.println("Perfect square");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s = sc.nextInt();
        try{
            checkSquare(s);
        }
        catch(NotPerfectSquareException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
