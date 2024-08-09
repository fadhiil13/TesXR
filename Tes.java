import java.util.Scanner;

public class Tes {
   public static void main(String[] args) {

      System.out.println(" welcome to program pencari luas lingkaran");
      double jari_jari;
      double phi = 22/7;
      double rumus;
      Scanner Masukan = new Scanner (System.in);
      
      System.out.println("nilai jari jari = ");
      jari_jari = Masukan.nextDouble();

      rumus = phi*jari_jari*jari_jari;

      System.out.println(" luas lingkaran = "+ rumus);


   }
}