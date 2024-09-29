import java.util.Scanner; //Import Scanner class for user input in the application

public class ClockApp {

    //Private values for storing hours, minutes, and seconds
    private double hours;
    private double minutes;
    private double seconds;

   //Setter method for Hours
    public void setHours(double hours) {
        this.hours = hours;
    }


    //Getter method for Hours
    public double getHours() {
        return this.hours;
    }

    //Setter method for Minutes
    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    //Getter method for Minutes
    public double getMinutes() {
        return this.minutes;
    }

    //Setter method for Seconds
    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    //Getter method for Seconds
    public double getSeconds() {
        return this.seconds;
    }

    //Method for displaying the Selection of Conversion
    public static void ShowSelection() {
        System.out.println("[1] Hours to Minutes");
        System.out.println("[2] Hours to Seconds");
        System.out.println("[3] Minutes to Hours");
        System.out.println("[4] Minutes to Seconds");
        System.out.println("[5] Seconds to Hours");
        System.out.println("[6] Seconds to Minutes");
    }
        
    //Method of the calculating for Hours to Minutes
    public void HoursToMinutes() {
    Scanner entervalue = new Scanner(System.in); //Allows to user input in the method
    System.out.print("Enter value: ");
    double ValueInput = entervalue.nextDouble(); //Ask the user for the value for conversion
    double hours = ValueInput;
    double totalMinutes = hours * 60;
    String MinutesLabel = (totalMinutes == 1) ? " minute" : " minutes"; //Whether the outcome be singular/plural
    System.out.println("Hours to Minutes " + totalMinutes + MinutesLabel);
    }
    
    //Method of the calculating for Hours to Seconds
    public void HoursToSeconds() {
    Scanner entervalue = new Scanner(System.in); //Allows to user input in the method
    System.out.print("Enter value: ");
    double ValueInput = entervalue.nextDouble(); //Ask the user for the value for conversion
    double hours = ValueInput;
    double totalSeconds = hours * 3600;
    String SecondsLabel = (totalSeconds == 1) ? " second" : " seconds"; //Whether the outcome be singular/plural
    System.out.println("Hours to Seconds: " + totalSeconds + SecondsLabel);
    }

    //Method of converting Minutes to Hours
    public void MinutesToHours() {
    Scanner entervalue = new Scanner(System.in); //Allows to user input in the method
    System.out.print("Enter value: "); 
    double ValueInput = entervalue.nextDouble(); //Ask the user for the value for conversion
    double minutes = ValueInput;
    double totalHours = minutes * 1 / 60;
    String hourLabel = (totalHours == 1) ? " hour" : " hours";  //Whether the outcome be singular/plural
    System.out.println("Minutes to Hours: " + totalHours + hourLabel);
    }
    
    //Method of converting Minutes to Seconds
    public void MinutesToSeconds() {
    Scanner entervalue = new Scanner(System.in); //Allows to user input in the method
    System.out.print("Enter value: ");
    double ValueInput = entervalue.nextDouble(); //Ask the user for the value for conversion
    double minutes = ValueInput;
    double totalSeconds = minutes * 60;
    String SecondsLabel = (totalSeconds == 1) ? " second" : " seconds"; //Whether the outcome be singular/plural
    System.out.println("Hours to Minutes " + totalSeconds + SecondsLabel);
    }

    //Method of converting Seconds to Hours
    public void SecondsToHours() {
    Scanner entervalue = new Scanner(System.in); //Allows to user input in the method
    System.out.print("Enter value: ");
    double ValueInput = entervalue.nextDouble();  //Ask the user for the value for conversion
    double seconds = ValueInput;
    double totalHours = seconds * 1 / 3600;
    String hourLabel = (totalHours == 1) ? " hour" : " hours"; //Whether the outcome be singular/plural
    System.out.println("Seconds To Hours " + totalHours + hourLabel);
    }
    
    //Method of converting Seconds to Minutes
    public void SecondsToMinutes() {
    Scanner entervalue = new Scanner(System.in);
    System.out.print("Enter value: ");
    double ValueInput = entervalue.nextDouble(); //Ask the user for the value for conversion
    double seconds = ValueInput;
    double  totalMinutes = seconds * 1 / 60;
    String MinutesLabel = (totalMinutes == 1) ? " minute" : " minutes"; //Whether the outcome be singular/plural
    System.out.println("Seconds To Minutes " +  totalMinutes + MinutesLabel);
    }

    //Main method to start the application
    public static void main(String[] args) {
    
    ClockApp method = new ClockApp(); //Creating an instance for calling the methods of the ClockApp class
    Scanner in = new Scanner(System.in);
    boolean continueApp = true; //Flag control for the upcoming loop
    
    //Using loops for continuation of the converting from the user until exiting the program 
    while (continueApp) {

        //Calling the method for the given options
        ShowSelection();
        System.out.print("Enter your choice: "); //Asking the user for the choices
        int choice = in.nextInt();

        //Varies from the appropriate input from the shown options 
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

        boolean ValidInput = false; //Flag control for the upcoming loop, either continue or exit the app
        
        //Loop for continuing or exiting the program
        while (!ValidInput) {
                System.out.print("\nDo you want to convert time? (Y/N): "); 
                char continueInput = in.next().charAt(0); //Gets user's input
                if (continueInput == 'N') {
                    ValidInput = true;
                    continueApp = false; //Exits the Application if 'N'
                    System.out.println("App Closed"); 
                } else if (continueInput == 'Y') {
                    ValidInput = true;
                    continueApp = true; //Cpntinues the Application
                } else {
                    System.out.print("Invalid choice! Please try again;");
                }
            }
            System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    }
    in.close(); //Close the Scanner
    }

}
