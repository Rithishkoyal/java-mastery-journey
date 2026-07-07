package Day_02;

public class OOPS {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.PRN =230105;
        s1.age=22;
        s1.name="Rithish Koyalkar";
        System.out.println(s1.PRN +" "+s1.age+" "+ s1.name);
    }
}

class Student{
    int age;
    String name;
    int PRN;
}
