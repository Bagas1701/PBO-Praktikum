package PraktikumPBO.Sesi11Sesi12.LatihanSoal1;

public class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        if (b != 0) {
            this.c = a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak diperbolehkan.");
            this.c = 0;
        }
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian: " + c);
    }
}
