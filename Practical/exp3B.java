import java.util.Scanner;



class car{
    private String model;
    private int price;
    private int year;
    
    //default constructor
    car(){
        model="";
        price=0;
        year=0;
    }

    //parameterized constructor
    car(String model, int price, int year){
        this.model = model;
        this.price = price;
        this.year = year;
    }

    //copy constructor
    car(car c){
        this.model = c.model;
        this.price = c.price;
        this.year = c.year;
    }

    //set data
    void setData(String model, int price, int year){
        this.model = model;
        this.price = price;
        this.year = year;
    }

    String getModel(){
        return model;
    }
    int getPrice(){
        return price;
    }
    int getYear(){
        return year;
    }
}



public class exp3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        car c1 = new car();
        car c2 = new car("Toyota", 20000, 2020);
        car c3 = new car("Honda", 25000, 2021);
        car c4 = new car(c2);
        car c5 = new car(c3);

        System.out.print("Enter model: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        c1.setData(model, price, year);


        car[] cars = {c1, c2, c3, c4, c5};
        for (int i=0; i<cars.length; i++){
            System.out.println("Car"+(i+1));
            System.out.println("Model: "+ cars[i].getModel());
            System.out.println("Price: "+ cars[i].getPrice());
            System.out.println("Year: "+ cars[i].getYear());
            System.out.println();
        }

        sc.close();
    }
}
