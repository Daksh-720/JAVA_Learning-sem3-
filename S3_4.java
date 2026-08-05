class student{
    String name;
    int age;

    student(){
        
    }
    
    student(String name){
        this.name = name;
       
    }

    student(String name, int age){
        this.name = name;
        this.age = age;

       
    }

    void display(){
       System.out.println("I'm a student");
       System.out.println("Name: " + name);
       System.out.println("Name: " + name + "Age: " + age);
    }

}



public class S3_4 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student("Daksh");
        student s3 = new student("Daksh", 18);

        s1.display();
        s2.display();
        s3.display();


    }
    
}
