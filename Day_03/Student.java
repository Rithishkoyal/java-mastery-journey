package Day_03;

public class Student {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2= new StudentDetails();
        StudentDetails s3 = new StudentDetails();


    }
}

class StudentDetails{
    String name;
    int age;
    StudentDetails(){
        System.out.println("Student Object created");
    }
}
