package PraktikumPBO.Sesi11Sesi12.LatihanSoal1;

public class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + c);
    }
}
