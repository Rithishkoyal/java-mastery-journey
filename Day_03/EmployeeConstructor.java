package Day_03;

public class EmployeeConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee( "Rithish",200000);
        Employee e2 = new Employee("Vennela", 300000);
        e1.display();
        e2.display();
    }
}

class Employee{
    String name;
    double salary;
        Employee(String n, double s){
            name = n;
            salary = s;

        }
        void display(){
            System.out.println("Employee Name : " +name);
            System.out.println("Salary : "+salary);
        }

}