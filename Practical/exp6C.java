//Problem 3: Hierarchical inheritance
//Write a Java program to demonstrate hierarchical inheritance.
//Create a parent class Person with data members name and age, a constructor, and a method display()
//that prints them. Create two child classes of Person. The class Student has a roll number and 
//three marks (m1, m2, m3), a method totalMarks() that returns their sum, and a method show() 
//that displays the person details, roll number and total marks. The class Employee has an 
//employee ID and a basic salary, a method gsal() that calculates the gross salary as 
//basic salary + 12% HRA + 7% TA, and a method show() that displays the person details, employee ID and 
//total salary. In the Main class, accept the name, roll number, age, three marks, employee ID and basic salary
//from the user using Scanner, create one Student object and one Employee object, and call show() on each.

import java.util.Scanner;


class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    int m1, m2, m3;
    Student(String name, int age, int m1, int m2, int m3){
        super(name, age);
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void totalmarks(){
        System.out.println("Total marks: "+(m1+m2+m3));
    }
    void show(){
        display();
        totalmarks();
    }
}

class Employee extends Person{
    int id, salary;
    Employee(String name, int age, int id, int salary){
        super(name, age);
        this.id=id;
        this.salary=salary;
    }
    
    void gsal(){
        int hra = (salary*12)/100;
        int ta = (salary*7)/100;
        System.out.println("Gross salary: "+(salary+hra+ta));
    }

    void show(){
        display();
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        gsal();
    }
}


public class exp6C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Student s = new Student(name, age, m1, m2, m3);
        s.show();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String eName = sc.nextLine();
        System.out.print("Enter employee age: ");
        int eAge = sc.nextInt();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();
        Employee e = new Employee(eName, eAge, id, salary);
        e.show();

        sc.nextLine();

        sc.close();
    }
}
