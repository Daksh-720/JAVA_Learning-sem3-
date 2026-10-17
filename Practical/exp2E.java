import java.util.Scanner;



class ScannerMethods{
    void display(){
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short: ");
        short s = sc.nextShort();

        System.out.print("Enter an int: ");
        int i = sc.nextInt();

        System.out.print("Enter a long: ");
        long l = sc.nextLong();

        System.out.print("Enter a float: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean bool = sc.nextBoolean();

        sc.nextLine(); // Clear leftover newline

        System.out.print("Enter a character: ");
        char c = sc.nextLine().charAt(0);

        System.out.print("Enter a word: ");
        String word = sc.next();

        sc.nextLine(); // Clear leftover newline

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Boolean = " + bool);
        System.out.println("Character = " + c);
        System.out.println("Word = " + word);
        System.out.println("Sentence = " + sentence);

        sc.close();
    }
}



public class exp2E {
    public static void main(String[] args){
        ScannerMethods m = new ScannerMethods();
        m.display();
    }
}
