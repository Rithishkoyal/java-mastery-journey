package Day_05;



    class Student extends Person{
        String branch;
        void displayStudent(){
            System.out.println("Branch : "+branch);
        }

        
    }

public class Person {
    String name;
    int age;
    void displayPerson(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

     public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rithish";
        s.age = 22;
        s.branch="CSE";

        s.displayPerson();
        s.displayStudent();
    }



   
}
