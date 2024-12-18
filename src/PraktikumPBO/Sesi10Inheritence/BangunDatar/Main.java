package PraktikumPBO.Sesi10Inheritence.BangunDatar;

public class Main {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
    
}
