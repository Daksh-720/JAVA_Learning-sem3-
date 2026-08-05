import java.util.*;



public class S3_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Odd or even: ");
        int n = sc.nextInt();

        String result = (n%2==0)?"even":"odd";
        System.out.println(n + "is: "+ result);

        System.out.print("Enter Number to check Whether you are eligible to Drive: ");
        int choice = sc.nextInt();

       switch(choice / 18) {
    case 0:
        System.out.println("Not eligible to drive");
        break;

    default:
        System.out.println("Eligible to drive");
}


     sc.close();
    }
    
}
