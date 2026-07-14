package Day_04;

public class UserAccount {
private String username;
private String password;
private String email;
private int age;

public void setUserName(String username){
    if(username==null || username.isBlank()){
        System.out.println(" Username Cannot be null");
    }else if(username.length()<4){
        System.out.println("Minimum 4 characters");
    }else{
        this.username = username;
    }
}
public void setPassword(String password){
    if(password.length()<8){
        System.out.println("password should contain Minimum 8 characters");
    }else if(password==null || password.isBlank()){
        System.out.println("password Cannot be null");
    }else{
        this.password= password;
    }
}
public void setEmail(String email){
    if(email == null || !email.contains("@")){
        System.out.println("Invalid Email");
    }else{
         this.email= email;
    }
  
}
public void setAge(int age){
    if(age>=18){
        this.age = age;
    }
    else{
        System.out.println("Age must be 18+");
    }
}

public String getUserName(){
    return username;
}

public String getEmail(){
    return email;
}
public int getAge(){
    return age;
}

public boolean verifyPassword(String enteredPassword){
    return password!=null && password.equals(enteredPassword);
}


public static void main(String[] args) {
    UserAccount user = new UserAccount();
    user.setAge(22);
    user.setEmail("koyalkarrithish@gmail.com");
    user.setPassword("123456788");
    user.setUserName("Rithish Koyalkar");

    System.out.println("User Name :"+user.getUserName());
    System.out.println("Email : "+user.getEmail());
    System.out.println(user.verifyPassword("12347899"));
    System.out.println(user.verifyPassword("123456788"));
    System.out.println("Age : "+user.getAge());


}

}
