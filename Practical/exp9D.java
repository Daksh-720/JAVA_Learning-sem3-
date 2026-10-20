public class exp9D {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        try{
            int a = 10;
            int b = 0;
            System.out.println("Division: "+(a/b));
            System.out.println("Array: " + arr[6]);
        }
        catch(ArithmeticException e){
            System.out.println("Not divisible by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index not found!!");
        }
    }
}
