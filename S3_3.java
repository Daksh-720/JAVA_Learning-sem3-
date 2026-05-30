class Employee{
    void work(){
        System.out.println("This is the Work of intelligence");
    }

    void getSalary(){
        int Salary = 50000000;
        System.out.println(Salary);
    }
}

class Hr_Manager extends Employee{
    @Override
    void work(){
        System.out.println("Hr is has Confirmed Recruitment");
    }

    void addEmployee(){
        System.out.print("Employee Added...!!!!!");
    }
}



public class S3_3 {
    public static void main(String[] args){

        Hr_Manager obj = new Hr_Manager();
        obj.work();
        obj.getSalary();
        obj.addEmployee();

    }
    
}
