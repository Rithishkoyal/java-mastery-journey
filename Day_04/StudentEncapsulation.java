package Day_04;

public class StudentEncapsulation {

    private String name;
    private int age;
    private String branch;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0){
             this.age = age;
        }
        else{
            System.out.println("Invalid Age...");
        }
       
    }
    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBranch(){
        return branch;
    }



    public static void main(String[] args) {
        StudentEncapsulation s1 = new StudentEncapsulation();
        s1.setAge(22);
        s1.setBranch("CSE");
        s1.setName("Rithish");
        s1.setAge(-3);
        System.out.println("Name : "+s1.getName());
        System.out.println("Age : "+s1.getAge());
        System.out.println("Branch : "+s1.getBranch());
    }
}

