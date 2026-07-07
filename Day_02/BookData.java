package Day_02;

public class BookData {
    public static void main(String[] args) {
        Book b1 = new Book();
          Book b2 = new Book();
            Book b3 = new Book();
        b1.author="Rithish";
        b1.bookId=111;
        b1.price=800;
        b1.title="Ramayan";
        
            b2.author="Vennela";
        b2.bookId=112;
        b2.price=600;
        b2.title="Mahabarat";
            b3.author="Rishitha";
        b3.bookId=101;
        b3.price=950;
        b3.title="JEE Main";
        b1.discount();
        b2.discount();
        b3.discount();
        System.out.println("Library Section ... ");
            b1.displayBook();
            b2.displayBook();
            b3.displayBook();

    }
}

class Book{
    int bookId;
    String title;
    String author;
    double price;
    int discount;
    double FinalPrice;

  
   
    void displayBook(){
        
       

        discount();
        
        System.out.println();
        System.out.println("BookId : "+bookId);
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
         if(discount>0){
            System.out.println("Discount : " +10+"%");
            System.out.println("Final Price : "+FinalPrice);
        }else{
            System.out.println("No discount Available");
        }
      expensiveBook();
    }
      void discount(){
        if(price>700){
            discount = 10;
            FinalPrice = price-((price*discount)/100);
        }
    }
    void expensiveBook(){
        if(price>600){
            System.out.println("Premium Book..");
        }else{
            System.out.println("Budjet Book..");
        }
    }
   

}