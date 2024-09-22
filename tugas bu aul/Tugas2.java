import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        int siswa, jumlahSiswa, nilaiSiswa = 0, rataRata, temp = 0;
        double totalNilai;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = in.nextInt();
        siswa = 1;
        
        while (siswa <= jumlahSiswa) {
            System.out.print("Masukkan Nilai Siswa " + siswa + ":");
            nilaiSiswa = in.nextInt();
            temp += nilaiSiswa;
            siswa++;
        }
        totalNilai = temp;
        rataRata = temp / jumlahSiswa;
        System.out.println("Total Nilai: " + totalNilai + "\nRata-Rata Nilai: " + rataRata);
        System.out.println();
        in.close();
    }
}
