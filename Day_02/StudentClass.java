package Day_02;

public class StudentClass {
    public static void main(String[] args){
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo();
        s1.name ="Rithish Koyalkar";
        s1.rollNo=67;
        s1.cgpa=8.56;
        s1.branch="Computer Science and engineering";

        
        s2.name ="Vennela Koyalkar";
        s2.rollNo=54;
        s2.cgpa=7.6;
        s2.branch="Computer Science and engineering";

        System.out.println("Student 1 Details");
        System.out.println("Name : "+s1.name);
         System.out.println("Roll No : "+s1.rollNo);
          System.out.println("Branch : "+s1.branch);
           System.out.println("CGPA : "+s1.cgpa);
            System.out.println("Student 2 Details ");
             System.out.println("Name : "+s2.name);
              System.out.println("Roll No : "+s2.rollNo);
               System.out.println("Branch : "+s2.branch);
                System.out.println("CGPA : "+s2.cgpa);

    }

}

class StudentInfo{
    String name;
    int rollNo;
    String branch;
    double cgpa;

}
