package Day_04.HospitalManagement;

public class Patient {
private int patientID;
private String patientName;
private int age;
private String gender;
private String disease;
private String doctorName;
private String phoneNumber;

public void setPatientID(int patientID){
    if(patientID>0){
        this.patientID= patientID;
    }
    else{
        System.out.println("patient id entered incorrect format");
    }
}
public void setPatientName(String patientName){
    if(patientName==null || patientName.isBlank()){
        System.out.println("Name cannot be null or blank");
    }else{
        this.patientName = patientName;
    }
}

public void setAge(int age){
    if(age>=1 && age<=120){
        this.age = age;
    }else{
        System.out.println("Age must be between 1 and 120 ");
    }
}

public void setGender(String gender){
    if(gender=="Male"||gender=="Female" ||gender=="Other"){
        this.gender = gender;
    }else{
        System.out.println("Gender must be Male/Female/Other ");
    }
}

public void setDisease(String disease){
    if(disease.isEmpty() || disease==null||disease.isBlank()){
        System.out.println("Disease cannot be empty");
    }
    else{
        this.disease = disease;

    }
}
public void setDoctorName(String doctorName){
    if(doctorName.isEmpty()|| doctorName==null||doctorName.isBlank()){
        System.out.println("Doctor name cannot be empty");
    }else{
        this.doctorName= doctorName;
    }
}

public void setPhoneNumber(String phoneNumber){
    if(phoneNumber.length()==10){
        this.phoneNumber =phoneNumber;
    }else{
        System.out.println("Phone number must contain exactly 10 digits");
    }
}

public int getPatientId(){
    return patientID;
}
public String getPatientName(){
    return patientName;
}
public int getAge(){
    return age;
}
public String getGender(){
 return gender;
}
public String getDisease(){
    return disease;
}
public String getDoctorName(){
    return doctorName;
}
public String getPhoneNumber(){
    return phoneNumber;
}


}
