package Day_05;

class Person{
    String name;
    int age;

    void displayPerson(){
        System.out.println("Name "+name);
        System.out.println("Age : "+age);
    }
}
class Employee extends Person{
    int employeeId;
    double salary;

    void displayEmployee(){
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Salary : "+salary);
    }


}

class Manager extends Employee{
    String department;
    int teamSize;
    void displayManager(){
        System.out.println("Department : "+department);
        System.out.println("Team Size : "+teamSize);
    }
}




public class PersonEmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rithish Koyalkar";
        m.age = 23;
        m.employeeId=1234;
        m.salary=50000;
        m.department= "CSE";
        m.teamSize=4;
       m.displayPerson();
       m.displayEmployee();
       m.displayManager();

    }
}
