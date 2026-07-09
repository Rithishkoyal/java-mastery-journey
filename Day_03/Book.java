package Day_03;

public class Book {
    public static void main(String[] args) {
        Bookdetails b1 = new Bookdetails();
        Bookdetails b2 = new Bookdetails("CPP");
        Bookdetails b3 = new Bookdetails("Java","Vennela");
        Bookdetails b4 = new Bookdetails("Python","Kishor",1500);
        b1.display();
        b2.display();
        b3.display();
        b4.display();

    }   
}

class Bookdetails{
    String title;
    String author;
    int price;
    Bookdetails(){
         title = "Unknown";
    author = "Unknown";
    price = 0;
        System.out.println("Constructor Created...");
    }
    Bookdetails(String t){
        title = t;
    }
    Bookdetails(String t,String a){
        title = t;
        author = a;

    }
    Bookdetails(String t,String a,int p){
         title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println(title+" "+author+" " +price);
    }
}
