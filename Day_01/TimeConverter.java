package Day_01;

public class TimeConverter {
    public static void main(String[] args) {
        int hours = 3;
        int seconds = hours * 3600;
        int minutes = hours *60;
        int days = hours / 24;
        System.out.println("There are " + seconds + " seconds in " + hours + " hours.");
        System.out.println("There are " + minutes + " minutes in " + hours + " hours.");
        System.out.println("There are " + days + " days in " + hours + " hours.");
    }
}
