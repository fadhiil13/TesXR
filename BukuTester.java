public class BukuTester {
    public static void main(String[] args) {

        Buku A1 = new Buku(110, " Laut Bercerita -", " Leila S -", " 2017 ");
        Buku A2 = new Buku(111, " Bumi Manusia -", " Pramoedya Ananta Toer -", " 1980 ");
        Buku A3 = new Buku(112, " Saman -", " Ayu Utami -", " 1998 ");
        Buku A4 = new Buku(113, " Ronggeng Dukuh Paruk -", " Ahmad Tohari -", " 1982");
        Buku A5 = new Buku(114, " Entrok -", " Okky Madasari -", " 2010");
        
        System.out.println(A1.id+A1.judul+A1.pengarang+A1.tahunTerbit);
        System.out.println(A2.id+A2.judul+A2.pengarang+A2.tahunTerbit);
        System.out.println(A3.id+A3.judul+A3.pengarang+A3.tahunTerbit);
        System.out.println(A4.id+A4.judul+A4.pengarang+A4.tahunTerbit);
        System.out.println(A5.id+A5.judul+A5.pengarang+A5.tahunTerbit);
    }
     
}
