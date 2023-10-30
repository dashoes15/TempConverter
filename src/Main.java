import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celc;
        boolean done = false;
        double f;
        String stop;
        //°F = (9/5) °C+32
        System.out.println("Enter a temperature in Celcius. Enter 'N' to stop.");
        do {
            if (scan.hasNextDouble()) {
                celc = scan.nextDouble();
                scan.nextLine();
                    f = (1.8)*celc+32;
                    System.out.println(f);
            }else {
                stop = scan.nextLine();
                if (stop.equals("N")) {
                    System.exit(0 );
                }

                System.out.println("You have entered something invalid. Try again.");
            }
        } while (!done);
    }
}