package PraktikumPBO.Sesi11Sesi12.KodeKomputer;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme menggunakan array Komputer
        Komputer[] komputers = new Komputer[3];
        komputers[0] = new PC();
        komputers[1] = new Laptop();
        komputers[2] = new Netbook();

        // Cetak melalui final class
        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(komputers);
    }
}