package Day_03;

public class CarConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
Car c2 = new Car("BMW");
Car c3 = new Car("BMW", "X5");
Car c4 = new Car("BMW", "X5", 2025);

c1.display();
c2.display();
c3.display();
c4.display();
    }
}

class Car{
    String brand;
    String model;
    int year;
    Car(){
         brand = "Unknown";
        model = "Unknown";
        year = 0;
        System.out.println("constructor created");

    }
    Car(String brand){
        this.brand = brand;
    }
    Car(String brand,String model){
         this.brand = brand;
         this.model = model;

    }
    Car(String brand,String model,int year){
         this.brand = brand;
         this.model = model;
         this.year = year;
    }
    void display(){
       
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);


    }
}