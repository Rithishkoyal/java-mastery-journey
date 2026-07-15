package Day_05;

class Employee{
    String name;
int employeeId;
double salary;
 
    void displayEmployee(){
        System.out.println("Name : "+name);
        System.out.println("Employee Id : "+employeeId);
        System.out.println("Salary : "+salary);

    }
}

class Developer extends Employee{
String programmingLanguage;
String projectName;

    void displayDeveloper(){

        System.out.println("Programming language : "+programmingLanguage);
        System.out.println("Project Name : "+projectName);

    }
}

class Tester extends Employee{
    String testingType;
int bugsFound;

void displayTester(){
    System.out.println("Testing Type : "+testingType);
    System.out.println("Bugs Found : "+bugsFound);

}
}



public class EmployeeRoles {
    public static void main(String[] args) {
        
        Developer developer = new Developer();

Tester tester = new Tester();

developer.name ="Rithish";
developer.employeeId=101;
developer.salary = 60000;
developer.programmingLanguage="Java";
developer.projectName = "E-Commerce API";

tester.name = "Rahul";
tester.employeeId=102;
tester.salary = 40000;
tester.testingType="Automation";
tester.bugsFound= 28;

developer.displayEmployee();
developer.displayDeveloper();
tester.displayEmployee();
tester.displayTester();


    }
}
