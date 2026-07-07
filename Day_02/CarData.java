package Day_02;

public class CarData {
    public static void main(String[] args) {
            CarInfo c1 = new CarInfo();
            c1.name = "Audi";
            c1.color="Blue";
            c1.tyres=4;
            c1.display();
 
            CarInfo c2 = c1;
                c2.name = "BMW";
             System.out.println(c2.name);
             System.out.println(c1.name);

    }
}

class CarInfo{
    String name;
    String color;
    int tyres;
    void display(){
        System.out.println( "Name : "+name);
        System.out.println("Color :"+ color);
        System.out.println("Tyres : "+  tyres);
    }
}