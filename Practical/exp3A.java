import java.util.Scanner;



class student{
    String name;
    int rollno;
    int marks;
    student(String name, int rollno, int marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void setName(String name){
        this.name = name;
    }
    void setRollno(int rollno){
        this.rollno = rollno;
    }
    void setMarks(int marks){
        this.marks = marks;
    }

    String getName(){
        return name;
    }
    int getRollno(){
        return rollno; 
    }
    int getMarks(){
        return marks;
    }
}




public class exp3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollno = sc.nextInt();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        student s = new student(name, rollno, marks);
        student s1 = new student("John", 101, 85);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Marks: " + s.getMarks());
        System.out.println();
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollno());
        System.out.println("Marks: " + s1.getMarks());
        sc.close();
    }
}