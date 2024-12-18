package PraktikumPBO.Sesi11Sesi12.Interface;

public class MobiKopter implements Mobil, Helikopter {
    private String nama;

    public MobiKopter(String nama) {
        this.nama = nama;
    }

    @Override
    public void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang");
    }
}