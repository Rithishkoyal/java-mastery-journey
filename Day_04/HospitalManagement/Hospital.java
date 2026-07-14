package Day_04.HospitalManagement;

public class Hospital {

    // Register Patient
    public void registerPatient(Patient patient,
                                int id,
                                String name,
                                int age,
                                String gender,
                                String disease,
                                String doctorName,
                                String phoneNumber) {

        patient.setPatientID(id);
        patient.setPatientName(name);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setDisease(disease);
        patient.setDoctorName(doctorName);
        patient.setPhoneNumber(phoneNumber);

        System.out.println("\nPatient Registered Successfully...");
    }

    // Display Patient Details
    public void displayPatient(Patient patient) {

        System.out.println("\n========== Patient Details ==========");
        System.out.println("Patient ID     : " + patient.getPatientId());
        System.out.println("Patient Name   : " + patient.getPatientName());
        System.out.println("Age            : " + patient.getAge());
        System.out.println("Gender         : " + patient.getGender());
        System.out.println("Disease        : " + patient.getDisease());
        System.out.println("Doctor Name    : " + patient.getDoctorName());
        System.out.println("Phone Number   : " + patient.getPhoneNumber());
        System.out.println("=====================================");
    }

    // Update Disease
    public void updateDisease(Patient patient, String newDisease) {

        patient.setDisease(newDisease);
        System.out.println("Disease Updated Successfully...");
    }

    // Update Doctor
    public void updateDoctor(Patient patient, String newDoctor) {

        patient.setDoctorName(newDoctor);
        System.out.println("Doctor Updated Successfully...");
    }

    // Update Phone Number
    public void updatePhoneNumber(Patient patient, String newPhone) {

        patient.setPhoneNumber(newPhone);
        System.out.println("Phone Number Updated Successfully...");
    }
}