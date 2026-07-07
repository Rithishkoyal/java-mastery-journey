package Day_02;

public class EmployeeData {
    public static void main(String[] args){
        EmployeeInfo e1 = new EmployeeInfo();
        e1.id=101;
        e1.name="Rithish Koyalakar";
        e1.Department="Techinical Staff";
        e1.Salary=50000;
        EmployeeInfo e2 = e1;
        System.out.println(e2.name);
        System.out.println();
        e1.display();
        


    }
}

class EmployeeInfo{
    int id;
    String name;
    String Department;
    double Salary;

    void display(){
        System.out.println("Employee Details...");
        System.out.println();
        System.out.println("Id : "+this.id);
        System.out.println("Name : " +this.name);
        System.out.println( "Dept : "+this.Department);
        System.out.println("Salary : " +this.Salary);
    }
}