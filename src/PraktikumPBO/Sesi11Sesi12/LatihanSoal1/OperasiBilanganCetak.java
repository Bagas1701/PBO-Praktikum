package PraktikumPBO.Sesi11Sesi12.LatihanSoal1;
public class OperasiBilanganCetak {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan ob : OB) {
            ob.set_A(a);
            ob.set_B(b);
            ob.set_C();
            ob.tampil();
        }
    }

    public static void main(String[] args) {
        double a = 10.5;
        double b = 0.5;

        OperasiBilangan[] operasi = new OperasiBilangan[4];
        operasi[0] = new OperasiPenjumlahan();
        operasi[1] = new OperasiPengurangan();
        operasi[2] = new OperasiPerkalian();
        operasi[3] = new OperasiPembagian();

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();
        cetak.cetakSemua(operasi, a, b);
    }
}
