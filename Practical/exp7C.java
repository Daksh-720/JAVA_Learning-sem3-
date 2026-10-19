import java.util.Scanner;



interface Salary{
    void basicSalary();
}

class Employee{
    String name;
    int age;
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class GrossSalary extends Employee implements Salary{
    double totalSalary;
    public void basicSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        double ta = salary * 0.10;
        double da = salary * 0.15;
        double hra = salary * 0.20;

        totalSalary = salary + ta + da + hra;

        sc.close();
    }

        void totalSal(){
        basicSalary();
        System.out.println("Total Salary: "+totalSalary);
    }
    
}



public class exp7C {
    public static void main(String[] args){
        GrossSalary g = new GrossSalary();
        g.name = "John";
        g.age = 30;
        g.display();
        g.totalSal();
    }
}
