import java.io.*;



public class exp9B {
    public static void main(String[] args){
        try{
            FileReader f = new FileReader("Epsteinfiles.txt");
            int ch = f.read();
            System.out.println((char)ch);
            f.close();
        }catch(IOException e){
            System.out.println("Error: File not found.");
        }
    }
}
