package PraktikumPBO.Sesi11Sesi12.LatihanSoal2;
abstract class OperasiBilanganAbs {
    protected double a, b, c;

    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected double get_A() {
        return a;
    }
    protected double get_B() {
        return b;
    }
    protected double get_C() {
        return c;
    }
    protected abstract void tampil();
}
