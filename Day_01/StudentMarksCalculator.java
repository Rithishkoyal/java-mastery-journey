package Day_01;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        
int Telugu = 90, English = 80, Maths = 0, Science = 90, Social = 80, Hindi = 70 ;      
double total = 0.0;double percentage = 0.0;
total = Telugu + English + Maths + Science + Social + Hindi;
percentage = (total / 600) *100 ;
System.out.println("Total Marks = " + total);
System.out.println("Percentage = " + percentage);
    }
}
