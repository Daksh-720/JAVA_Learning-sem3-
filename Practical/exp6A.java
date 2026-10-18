class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayperson(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

class student extends person{
    int id;
    student(String name, int age, int id){
        super(name, age);
        this.id = id;
    }

    void displaystudent(){
        displayperson();
        System.out.println("ID: "+ id);
    }
}



public class exp6A {
    public static void main(String[] args){
        student s1 = new student("Alice", 20, 123);
        s1.displaystudent();
    }    
}
