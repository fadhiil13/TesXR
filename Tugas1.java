import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int i;
        int nilaiAwal, nilaiAkhir;

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Nilai Awal: ");
        nilaiAwal = in.nextInt();
        System.out.println("Masukkan Nilai Akhir: ");
        nilaiAkhir = in.nextInt();
        i = nilaiAwal;
        while (i <= nilaiAkhir) {

            i++;
            if (i % 6 == 0) {
                System.out.println(i);
            }

        }
        in.close();

    }

}
    
    

