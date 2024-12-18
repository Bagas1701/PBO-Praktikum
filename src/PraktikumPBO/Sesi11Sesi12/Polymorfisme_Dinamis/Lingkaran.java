package PraktikumPBO.Sesi11Sesi12.Polymorfisme_Dinamis;

public class Lingkaran extends Bentuk {
    protected void gambar() {
        System.err.println("Subclass -> Menggambar Lingkaran");
    }    
    protected void hapus() {
        System.out.println("Subclass -> Menghapus Gambar Lingkaran");
    }
}
