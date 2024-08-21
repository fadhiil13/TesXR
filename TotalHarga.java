import java.util.Scanner;

public class TotalHarga {
    public static void main(String[] args) {
        double diskon;
        int Harga_Barang;
        int Total_Barang;
        int Total_Harga;
        
        Scanner scan_aja = new Scanner(System.in);

        System.out.println("sistem hitung diskon");

        System.out.println(" Masukan Harga Barang ");
        Harga_Barang = scan_aja.nextInt();

        System.out.println("Total Barangnya Berapa");
        Total_Barang = scan_aja.nextInt();
        Total_Harga = Harga_Barang * Total_Barang;

        System.out.println(" Total Harga Adalah " + Total_Harga);

        System.out.println(" Berapa Diskonya: ");
        diskon = scan_aja.nextDouble();
        diskon = diskon / 100 * Total_Harga;

        double Harga_Akhir = Total_Harga - diskon;

        System.out.println(" Harga Total Barang Adalah "+ Harga_Akhir);



        
    }

   
}



    