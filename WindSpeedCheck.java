import java.util.Scanner;

public class WindSpeedCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wind speed (km/h): ");
        int speed = sc.nextInt();

        if (speed < 20) {
            System.out.println("Light wind - Safe conditions.");
        } 
        else if (speed >= 20 && speed < 50) {
            System.out.println("Moderate wind - Be cautious.");
        } 
        else if (speed >= 50 && speed < 100) {
            System.out.println("Strong wind - Risky conditions!");
        } 
        else {
            System.out.println("Cyclone-level wind - Dangerous!!!");
        }

        sc.close();
    }
}