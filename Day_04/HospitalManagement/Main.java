package Day_04.HospitalManagement;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();
        Patient patient = new Patient();

        while (true) {

            System.out.println("\n========== Hospital Management System ==========");
            System.out.println("1. Register Patient");
            System.out.println("2. Display Patient Details");
            System.out.println("3. Update Disease");
            System.out.println("4. Update Doctor");
            System.out.println("5. Update Phone Number");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender : ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Disease : ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Doctor Name : ");
                    String doctor = sc.nextLine();

                    System.out.print("Enter Phone Number : ");
                    String phone = sc.nextLine();

                    hospital.registerPatient(
                            patient,
                            id,
                            name,
                            age,
                            gender,
                            disease,
                            doctor,
                            phone);

                    break;

                case 2:

                    hospital.displayPatient(patient);
                    break;

                case 3:

                    System.out.print("Enter New Disease : ");
                    String newDisease = sc.nextLine();

                    hospital.updateDisease(patient, newDisease);

                    break;

                case 4:

                    System.out.print("Enter New Doctor : ");
                    String newDoctor = sc.nextLine();

                    hospital.updateDoctor(patient, newDoctor);

                    break;

                case 5:

                    System.out.print("Enter New Phone Number : ");
                    String newPhone = sc.nextLine();

                    hospital.updatePhoneNumber(patient, newPhone);

                    break;

                case 6:

                    System.out.println("\nThank You...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
