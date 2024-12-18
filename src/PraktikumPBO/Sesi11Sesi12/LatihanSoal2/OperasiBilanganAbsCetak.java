package PraktikumPBO.Sesi11Sesi12.LatihanSoal2;

public class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (OperasiBilanganAbs ob : OB) {
            ob.set_A(a);
            ob.set_B(b);
            ob.set_C();
            ob.tampil();
        }
    }

    public static void main(String[] args) {
        double a = 6.5;
        double b = 0.5;

        OperasiBilanganAbs[] operasi = new OperasiBilanganAbs[4];
        operasi[0] = new OperasiPenjumlahan();
        operasi[1] = new OperasiPengurangan();
        operasi[2] = new OperasiPerkalian();
        operasi[3] = new OperasiPembagian();

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasi, a, b);
    }
}
