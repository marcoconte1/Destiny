import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

   private ArrayList<Arma> armi;
   public Inventario() {
      this.armi = new ArrayList<Arma>();
   }
   public void aggiungiArma() {
      this.armi.add(new Arma());
   }

   public void rimuoviArma() {
      Scanner in = new Scanner(System.in);
      String nomeEliminare;
      System.out.print("Quale arma vuoi rimuovere? ");
      nomeEliminare = in.nextLine();

      for (Arma e : this.armi) {
         if(e.getNome().equals(nomeEliminare))
            this.armi.remove(e);
      }
   }

   public void plotAverage() {

      int impatto = 0;
      int gittata = 0;
      int stabilita = 0;
      int manegevolezza = 0;
      int velocitaRicarica = 0;
      int proiettiliAlMinuto = 0;
      int caricatore = 0;

      for (Arma e : this.armi) {
         impatto += e.getImpatto();
         gittata += e.getGittata();
         stabilita += e.getStabilita();
         manegevolezza += e.getManegevolezza();
         velocitaRicarica += e.getVelocitaRicarica();
         proiettiliAlMinuto += e.getProiettiliAlMinuto();
         caricatore += e.getCaricatore();
      }

      double mediaImpatto = impatto / this.armi.size();
      double mediaGittata = gittata / this.armi.size();
      double mediaStabilita = stabilita / this.armi.size();
      double mediaManegevolezza = manegevolezza / this.armi.size();
      double mediaVelocitaRicarica = velocitaRicarica / this.armi.size();
      double mediaProiettiliAlMinuto = proiettiliAlMinuto / this.armi.size();
      double mediaCaricatore = caricatore / this.armi.size();

      System.out.println("0   10   20   30   40   50   60   70   80   90  100");
      System.out.println("|    |    |    |    |    |    |    |    |    |    |");
      for(int i = 0; i <= mediaImpatto; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("impatto\n");
      for(int i = 0; i <= mediaGittata; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("gittata\n");
      for(int i = 0; i <= mediaStabilita; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("stabilità\n");
      for(int i = 0; i <= mediaManegevolezza; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("manegevolezza\n");
      for(int i = 0; i <= mediaVelocitaRicarica; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("velocità di ricarica\n");
      for(int i = 0; i <= mediaProiettiliAlMinuto; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("proiettili al minuto\n");
      for(int i = 0; i <= mediaCaricatore; i = i + 2) {
         System.out.print('*');

      }
      System.out.print("caricatore\n");
   }

   public void stampaArmi() {
      if(this.armi.size() == 0)
         System.out.println("Non è presente nessuna arma");
      for (Arma e: this.armi)
         System.out.println("Nome: " + e.getNome() + " - Impatto: " + e.getImpatto() + " - Gittata: " + e.getGittata() + " - Stabilità: " + e.getStabilita() + " - Manegevolezza: " + e.getManegevolezza() + " - Velocità di ricarica: " + e.getVelocitaRicarica() + " - Proiettili al minuto: " + e.getProiettiliAlMinuto() + " - Caricatore: " + e.getCaricatore());
   }
}
