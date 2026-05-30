import java.util.Scanner;

class employee2{
    String Name;
    int emp_id;
    double salary;
}



public class S3_10 {
    public static void main(String[] args){
        employee2 e[] = new employee2[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<e.length; i++){
         e[i] = new employee2();

         System.out.println("Enter Employee name: ");
         e[i].Name = sc.nextLine();

         System.out.println("Enter Employee id: ");
         e[i].emp_id = sc.nextInt();

         System.out.println("Enter employee Salary: ");
         e[i].salary = sc.nextDouble();


         sc.nextLine();

        }
        sc.close();

        

        System.out.println("================EMPLOYEE_DETAILSSS==============");


        for(int i=0; i<5; i++){
         System.out.println("Name: "+ e[i].Name);
         System.out.println("Emp_Id: "+ e[i].emp_id);
         System.out.println("Salary: "+ e[i].salary);

        }


    }
}
