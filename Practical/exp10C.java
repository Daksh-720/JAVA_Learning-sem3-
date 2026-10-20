import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}



public class exp10C {
    static void Withdraw(int withdraw) throws InsufficientBalanceException{
        int balance = 10000;

        if(withdraw>balance){
            throw new InsufficientBalanceException("INSUFFICIENT BALANCE");
        }else{
            System.out.println("Withdrawal successful");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();
        try{
            Withdraw(withdraw);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
    
}
