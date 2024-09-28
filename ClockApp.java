import java.util.Scanner;

public class ClockApp {
    private double hours;
    private double minutes;
    private double seconds;

   
    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return this.hours;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    public double getMinutes() {
        return this.minutes;
    }

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return this.seconds;
    }

    public static void ShowSelection() {
        System.out.println("[1] Hours to Minutes");
        System.out.println("[2] Hours to Seconds");
        System.out.println("[3] Minutes to Hours");
        System.out.println("[4] Minutes to Seconds");
        System.out.println("[5] Seconds to Hours");
        System.out.println("[6] Seconds to Minutes");

        }
    
        public void HoursToMinutes() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double hours = ValueInput;
            String MinutesLabel = (ValueInput == 1) ? " minutes" : " minute";
            double totalMinutes = hours * 60;
            System.out.println("Hours to Minutes " + totalMinutes + MinutesLabel);
        }
    
        public void HoursToSeconds() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double hours = ValueInput;
            String SecondsLabel = (ValueInput == 1) ? " seconds" : " second";
            double totalSeconds = hours * 3600;
            System.out.println("Hours to Seconds: " + totalSeconds + SecondsLabel);
        }
        public void MinutesToHours() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double minutes = ValueInput;
            String hourLabel = (ValueInput == 1) ? " hours" : " hour";
            double totalHours = minutes * 1 / 60;
            System.out.println("Minutes to Hours: " + totalHours + hourLabel);
        }
    
        public void MinutesToSeconds() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double minutes = ValueInput;
            String SecondsLabel = (ValueInput == 1) ? " seconds" : " second";
            double totalSeconds = minutes * 60;
            System.out.println("Hours to Minutes " + totalSeconds + SecondsLabel);
        }

        public void SecondsToHours() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double seconds = ValueInput;
            String hourLabel = (ValueInput == 1) ? " hours" : " hour";
            double totalHours = seconds * 1 / 3600;
            System.out.println("Seconds To Hours " + totalHours + hourLabel);
        }
    
        public void SecondsToMinutes() {
            Scanner entervalue = new Scanner(System.in);
            System.out.print("Enter value: ");
            double ValueInput = entervalue.nextDouble();
            double seconds = ValueInput;
            String MinutesLabel = (ValueInput == 1) ? " minutes" : " minute";
            double  totalMinutes = seconds * 1 / 60;
            System.out.println("Seconds To Minutes " +  totalMinutes + MinutesLabel);
        }

    public static void main(String[] args) {
    ClockApp method = new ClockApp();
    Scanner in = new Scanner(System.in);
    boolean continueApp = true;


    while (continueApp) {

        ShowSelection();

        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch(choice) {
            case 1:
                method.HoursToMinutes();
                break;

            case 2:
                method.HoursToSeconds();
                break;

            case 3:
                method.MinutesToHours();
                break;

            case 4:
                method.MinutesToSeconds();
                break;
            
            case 5:
                method.SecondsToHours();
                break;

            case 6:
                method.SecondsToMinutes();
                break;
 
            default:
                System.out.println("Invalid choice! Please try again;");


        }

        boolean ValidInput = false;
        
        while (!ValidInput) {
                System.out.print("\nDo you want to convert time? (Y/N): ");
                char continueInput = in.next().charAt(0);
                if (continueInput == 'N') {
                    ValidInput = true;
                    continueApp = false; 
                    System.out.println("App Closed");
                } else if (continueInput == 'Y') {
                    ValidInput = true;
                    continueApp = true;
                } else {
                    System.out.print("Invalid choice! Please try again;");
                }
            }
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    }
    in.close();
    }

}
