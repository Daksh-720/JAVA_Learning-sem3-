import java.util.Scanner;



class InvalidExperienceException extends Exception{
    InvalidExperienceException(String msg){
        super(msg);
    }
}



public class exp10A {
    static void checkExperience(int n) throws InvalidExperienceException{
        if(n<0 || n>40){
            throw new InvalidExperienceException("INVALID EXPERIENCE");
        }else{
            System.out.println("Valid Experience");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Experience: ");
        int n = sc.nextInt();
        try{
            checkExperience(n);
        }
        catch(InvalidExperienceException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
