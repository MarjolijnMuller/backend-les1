import java.util.Scanner;

public class Opdracht5 {
    //uitbreiding met for-loop en 2-demensionale array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] gegevens = new String[3][2];

        for (int i = 0; i < gegevens.length; i++) {
            System.out.println("Geef mij een naam: ");
            gegevens[i][0] = sc.nextLine();

            System.out.println("Geef mij het huisdier: ");
            gegevens[i][1] = sc.nextLine();
        }

        for (int i = 0; i < gegevens.length; i++) {
            System.out.println(gegevens[i][0] + " heeft een " + gegevens[i][1]);
        }



        /*
        Uitgebreide versie:

        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        String[] animals = new String[3];

        System.out.println("Voer de naam van de eerste persoon in: ");
        names[0] = sc.nextLine();
        System.out.println("Voer het huisdier van de eerste persoon in: ");
        animals[0] = sc.nextLine();

        System.out.println("Voer de naam van de tweede persoon in: ");
        names[1] = sc.nextLine();
        System.out.println("Voer het huisdier van de tweede persoon in: ");
        animals[1] = sc.nextLine();

        System.out.println("Voer de naam van de derde persoon in: ");
        names[2] = sc.nextLine();
        System.out.println("Voer het huisdier van de derde persoon in: ");
        animals[2] = sc.nextLine();

        System.out.println(names[0] + " heeft een " + animals[0]);
        System.out.println(names[1] + " heeft een " + animals[1]);
        System.out.println(names[2] + " heeft een " + animals[2]);
         */
    }
}
