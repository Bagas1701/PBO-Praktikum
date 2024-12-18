package PraktikumPBO.Sesi11Sesi12.LatihanSoal2;

class OperasiPembagian extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

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