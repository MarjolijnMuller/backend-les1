import java.util.Scanner;

public class Opdracht3NoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geeft de eerste naam: ");
        String name1 = scanner.nextLine();
        System.out.println("Geeft de tweede naam: ");
        String name2 = scanner.nextLine();
        System.out.println("Geeft de derde naam: ");
        String name3 = scanner.nextLine();
        System.out.println("Geeft de vierde naam: ");
        String name4 = scanner.nextLine();

        System.out.println("De namen die je hebt gegeven zijn: ");
        System.out.println("1: " + name1);
        System.out.println("2: " + name2);
        System.out.println("3: " + name3);
        System.out.println("4: " + name4);
    }
}
