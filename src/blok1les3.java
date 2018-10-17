import java.util.Scanner;

public class blok1les3 {
    public static void main(String[] args) {

        System.out.println("Wat is jouw naam?");
        Scanner scanner = new Scanner(System.in);
        String naam = scanner.nextLine();

        System.out.println("Heb je een scooterrijbewijs? ");
        Boolean scooter = scanner.nextBoolean();


        if (scooter == true) {
            System.out.println("" + naam + " je mag scooter rijden omdat je een rijbewijs heb.");
            System.out.println();
        }
        else if (scooter == false) {
            System.out.println("Jammer genoeg mag je geen scooter rijden omdat je nog geen rijbewijs heb");
        }
        System.out.println("Hoe oud ben je? ");
        int oud = scanner.nextByte();
        System.out.println();


        if (oud < 16) {
            System.out.println("Sorry " + naam + " je bent niet oud genoeg om auto of scooter te rijden");
            System.out.println();
        } else if (oud < 17 & scooter == false) {
            System.out.println("jammer genoeg moet je nog wachten voordat jij scooter kan rijden " + naam);
            System.out.println();
        } else if (oud == 17) {
            System.out.println("als jij je rijbewijs heb dan mag je beginnen met scooter rijden.");
            System.out.println();
        } else if (oud >= 18) {
            System.out.println("gefeliciteerd" + naam + "je bent oud genoeg om scooter te rijden");
            System.out.println();
        }

        System.out.println("Heb je een autorijbewijs? ");
        Boolean auto = scanner.nextBoolean();

        if (auto == true) {
            System.out.println("okee " + naam + " je mag auto rijden omdat je een rijbewijs heb.");
            System.out.println();
        }
        else {
            System.out.println("Jammer genoeg mag je moet eerst je auto rijbewijs halen");
            System.out.println();
        }

    }
}


