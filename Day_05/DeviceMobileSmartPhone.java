package Day_05;

class Device{
String brand;
double price;

void displayDevice(){
    System.out.println("Brand : "+brand);
    System.out.println("Price : "+price);
}

}

class Mobile extends Device{
String simType;
int batteryCapacity;

void displayMobile(){
    System.out.println("Sim Type : "+simType);
    System.out.println("Storage : "+batteryCapacity);

}

}

class SmartPhone extends Mobile{
int ram;
int Storage;
String operatingSystem;

void displaySmartPhone(){
    System.out.println("Ram : "+ram);
    System.out.println("Storage : "+Storage);
    System.out.println("OS : "+operatingSystem);
}

}






public class DeviceMobileSmartPhone {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.brand= "Samsung";
        phone.price= 39999;
        phone.simType="Dual SIM";
        phone.batteryCapacity=5000;
        phone.ram= 12;
        phone.Storage=512;
        phone.operatingSystem="Android";

        phone.displayDevice();
        phone.displayMobile();
        phone.displaySmartPhone();

    }
}
