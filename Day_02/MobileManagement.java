package Day_02;

public class MobileManagement {
    public static void main(String[] args) {
        Mobile oppo = new Mobile();
        Mobile vivo = new Mobile();

        oppo.brand="Oppo";
        oppo.model="Reno 8";
        oppo.price = 15000;
        oppo.battery=79;
        oppo.isOn=false;

        vivo.brand = "Vivo";
        vivo.model = "v20";
        vivo.price=20000;
        vivo.battery=89;
        vivo.isOn=false;

// oppo.powerOn();
// oppo.usePhone(3);
// oppo.charge(20);
// oppo.display();

vivo.powerOn();
vivo.usePhone(5);
vivo.display();
vivo.usePhone(8);
vivo.display();

    }
}


class Mobile{
String brand;
String model;
double price;
int battery;
boolean isOn;

    void powerOn(){
        System.out.println(brand +" Switched ON");
        isOn = true;
    }

    void powerOff(){
        System.out.println(brand +"Mobile Switched Off");
        isOn = false;
    }

    void charge(int percentage){
        battery+=percentage;
        System.out.println(brand+"Charging...");
        System.out.println();
        System.out.println("Battery : "+battery+"%");



    }
    void usePhone(int hours){

        System.out.println( brand+"Used Phone for "+hours+" Hours");

         battery = battery - (hours*10);
         if(battery<=0){
            System.out.println(brand+"Phone turned Off...");
            battery=0;
            isOn=false;
         }else{
             System.out.println("Battery : "+battery+"%");
         }
       

    }

    void display(){
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
        System.out.println("Battery : "+battery+"%");
        System.out.println("Status : "+isOn);
        System.out.println("-------------------------");

    }   

}