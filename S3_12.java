import java.util.*;


class employeee{
    int id;
    double salary;
}



public class S3_12 {
    public static void main(String[] args){
        employeee e[] = new employeee[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<e.length; i++){
            e[i] = new employeee();

            System.out.print("Enter Employee id: ");
            e[i].id = sc.nextInt();

            System.out.println();

            System.out.print("Enter Employee Salary: ");
            e[i].salary = sc.nextDouble();

            System.out.println();
        }

        int highest = 0;

        if(e[1].salary>e[highest].salary){
            highest = 1;
        }

        if(e[2].salary>e[highest].salary){
            highest = 2;
        }

        if(e[3].salary>e[highest].salary){
            highest = 3;
        }

        if(e[4].salary>e[highest].salary){
            highest = 4;
        }



        System.out.println(
            "=========================Highest paid EMPLOYEE_DETAILS========================"
        );



        System.out.println("Highest paid Id: "+ e[highest].id);
        System.out.print("HIGHEST SALARY: "+ e[highest].salary);



      sc.close();
    }
    
}
