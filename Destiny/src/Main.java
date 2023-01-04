import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario Armi = new Inventario();

        do {
            System.out.println("MENU:");
            System.out.println("a. Aggiungi un'arma;");
            System.out.println("b. Stampa armi;");
            System.out.println("c. Rimuovi un'arma;");
            System.out.println("d. Stampa il plot average;");
            System.out.println("e. Esci.");
            System.out.print("Scegli: ");
            Scanner in = new Scanner(System.in);
            char scelta = (in.next()).charAt(0);

            switch (scelta) {
                case 'a':
                    Armi.aggiungiArma();
                    break;
                case 'b':
                    Armi.stampaArmi();
                    break;
                case 'c':
                    Armi.rimuoviArma();
                    break;
                case 'd':
                    Armi.plotAverage();
                    break;
                case 'e':
                    return;
                default:
                    System.out.println("Carattere non consentito, riprova");

            }
        } while(true);

    }
}