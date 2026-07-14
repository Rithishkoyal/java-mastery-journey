package Day_04;

public class EmployeeEncapsulation {

private  String name;
private double salary;
private String department;

public void setName(String name){
    if(name == null || name.isBlank()){
        System.out.println("Name cannot be empty");
    }
this.name= name;
}

public void setSalary(double salary){
    if(salary>0){
this.salary= salary;
    }
    else{
        System.out.println("Salary must be greater than 0");
    }

}
public void setDepartment(String dept){
this.department= dept;
}
public String getName(){
   
    return name;
}
public double getSalary(){
    return salary;
}
public String getDept(){
    return department;
}




    public static void main(String[] args) {
        EmployeeEncapsulation e = new EmployeeEncapsulation();
        e.setName("Rithish");
        e.setSalary(21000);
        e.setDepartment("CSE");

        System.out.println("Name : "+e.getName());
        System.out.println("salary : "+e.getSalary());
        System.out.println("Dept : "+e.getDept());
        e.setName(null);
        e.setName("  ");
    }
}
