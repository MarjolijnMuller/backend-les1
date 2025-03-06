import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("geef het eerste getal: ");
        int num1 = scanner.nextInt();
        System.out.println("geef het tweede getal: ");
        int num2 = scanner.nextInt();
        System.out.println("geef het derde getal: ");
        int num3 = scanner.nextInt();
        System.out.println("De som is: " + (num1 + num2));
        System.out.println("De som van de 3 getallen is: " + (num1 + num2 + num3));
        System.out.println("Het verschil is: " + (num1 - num2));
        System.out.println("De vermenigvuldiging is: " + (num1 * num2));
    }

}

