public class exp9C {
    public static void main(String[] args){
        try{
            Class.forName("epsteinfiles");
            System.out.println("Class loaded successfully");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}
