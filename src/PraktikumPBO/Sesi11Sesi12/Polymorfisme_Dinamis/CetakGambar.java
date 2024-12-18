package PraktikumPBO.Sesi11Sesi12.Polymorfisme_Dinamis;

public class CetakGambar extends Bentuk {
    private void tampil(Bentuk[] obj) {
        //Polimorfisme
        //memanggil method yang sama yaitu method gambar() dan hapus()
        //pada masing-masing class
        for (int i=0; i<obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("=================");
        }
    }
    
    public static void main(String[] args) {
        Bentuk[] obj = { new Lingkaran(), new Elips(), new Segitiga()};
        CetakGambar cetak = new CetakGambar();

        // Menampilkan method gambar() & hapus() pada class Bentuk (Superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("=====================");

        //Overriding
        //Menumpuk method gambar() & hapus() pada class Bentuk (superclass)
        //dengan method gambar() & hapus() pada subclassnya
        //yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);
    }
}
