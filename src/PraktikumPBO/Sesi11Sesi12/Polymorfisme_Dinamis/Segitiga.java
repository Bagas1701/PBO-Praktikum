package PraktikumPBO.Sesi11Sesi12.Polymorfisme_Dinamis;
public class Segitiga extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar Segitiga");
    }
    protected void hapus() {
        System.out.println("Subclass -> Menghapus gambar Segitiga");
    }
}
