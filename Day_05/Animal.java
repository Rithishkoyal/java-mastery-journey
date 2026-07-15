package Day_05;

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }

}


public class Animal {
    String name;
    String breed;
   void bark(){
    System.out.println("Animal is barking");
   }
   public static void main(String[] args) {
    Dog d = new Dog();
    d.name="Dogesh Bai";
    d.breed="male";
    d.bark();
    d.eat();
   }
}

