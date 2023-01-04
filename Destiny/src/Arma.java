import java.util.Scanner;

public class Arma {
    private String nome;
    private int impatto;
    private int gittata;
    private int stabilita;
    private int manegevolezza;
    private int velocitaRicarica;
    private int proiettiliAlMinuto;
    private int caricatore;

    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getNome() {
         return nome;
     }

     public void setImpatto(int impatto) {
        this.impatto = impatto;
    }

     public int getImpatto() {
         return impatto;
     }

     public void setGittata(int gittata) {
        this.gittata = gittata;
    }

     public int getGittata() {
         return gittata;
     }

     public void setStabilita(int stabilita) {
        this.stabilita = stabilita;
    }

     public int getStabilita() {
         return stabilita;
     }

     public void setManegevolezza(int manegevolezza) {
        this.manegevolezza = manegevolezza;
    }

     public int getManegevolezza() {
         return manegevolezza;
     }

     public void setVelocitaRicarica(int velocitaRicarica) {
        this.velocitaRicarica = velocitaRicarica;
    }

     public int getVelocitaRicarica() {
         return velocitaRicarica;
     }

     public void setProiettiliAlMinuto(int proiettiliAlMinuto) {
        this.proiettiliAlMinuto = proiettiliAlMinuto;
    }

     public int getProiettiliAlMinuto() {
         return proiettiliAlMinuto;
     }

     public void setCaricatore(int caricatore) {
        this.caricatore = caricatore;
    }

     public int getCaricatore() {
         return caricatore;
     }

    public Arma() {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il nome dell'arma: ");
        String nome = in.nextLine();
        this.nome = nome;

        int impatto = 5;
        do {
            System.out.print("Inserisci il valore dell'impatto dell'arma: ");
            impatto = in.nextInt();
            this.impatto = impatto;
        } while(impatto < 0 || impatto > 100);

        int gittata = 5;
        do {
            System.out.print("Inserisci il valore della gittata dell'arma: ");
            gittata = in.nextInt();
            this.gittata = gittata;
        } while(gittata < 0 || gittata > 100);

        int stabilita = 5;
        do {
            System.out.print("Inserisci il valore della stabilità dell'arma: ");
            stabilita = in.nextInt();
            this.stabilita = stabilita;
        } while(stabilita < 0 || stabilita > 100);

        int manegevolezza = 5;
        do {
            System.out.print("Inserisci il valore della manegevolezza dell'arma: ");
            manegevolezza = in.nextInt();
            this.manegevolezza = manegevolezza;
        } while(manegevolezza < 0 || manegevolezza > 100);

        int velocita = 5;
        do {
            System.out.print("Inserisci il valore della velocità di ricarica dell'arma: ");
            velocita = in.nextInt();
            this.velocitaRicarica = velocita;
        } while(velocita < 0 || velocita > 100);

        int proiettili = 5;
        do {
            System.out.print("Inserisci il valore dei proiettili al minuto dell'arma: ");
            proiettili = in.nextInt();
            this.proiettiliAlMinuto = proiettili;
        } while(proiettili < 0 || proiettili > 100);

        int caricatore = 5;
        do {
            System.out.print("Inserisci il valore del caricatore dell'arma: ");
            caricatore = in.nextInt();
            this.caricatore = caricatore;
        } while(caricatore < 0 || caricatore > 100);
    }
}
