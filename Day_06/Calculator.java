package Day_06;

class Calc{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}



public class Calculator {
    public static void main(String[] args) {
        Calc c = new Calc();
      System.out.println(c.add(2, 03));  
       System.out.println( c.add(1.2,3.1 ));
        System.out.println(c.add(1,2 , 3));

    }

}
