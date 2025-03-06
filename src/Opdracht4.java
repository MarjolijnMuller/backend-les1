import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namen = new String[3];

        System.out.print("Geef de eerste naam: ");
        namen[0] = sc.nextLine();
        System.out.print("Geef de tweede naam: ");
        namen[1] = sc.nextLine();
        System.out.print("Geef de derde naam: ");
        namen[2] = sc.nextLine();

        System.out.println("De opgegeven namen zijn: ");
        System.out.println("1: " + namen[0]);
        System.out.println("2: " + namen[1]);
        System.out.println("3: " + namen[2]);
    }
}
