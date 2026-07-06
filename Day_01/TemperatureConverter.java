package Day_01;


public class TemperatureConverter {
    public static void main(String[] args){
        double celsius = 34.0;
        double fahrenhite = (celsius * 1.8) + 32.0;
        
        System.out.println("The temperature in fahrenhite is " + fahrenhite);
        celsius = (fahrenhite -32.0)/1.8;
        System.out.println("The temperature in celsius is " + celsius);

    }
}
