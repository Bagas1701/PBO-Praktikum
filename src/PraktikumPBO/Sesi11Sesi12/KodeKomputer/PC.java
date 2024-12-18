package PraktikumPBO.Sesi11Sesi12.KodeKomputer;

public class PC extends Komputer {
    @Override
    void hidupkanOS() {
        System.out.println("PC: OS dihidupkan");
    }

    @Override
    void matikanOS() {
        System.out.println("PC: OS dimatikan");
    }

    @Override
    public void klikKanan() {
        System.out.println("PC: Klik kanan mouse");
    }

    @Override
    public void klikKiri() {
        System.out.println("PC: Klik kiri mouse");
    }

    @Override
    public void tekanEnter() {
        System.out.println("PC: Tekan tombol Enter");
    }

    @Override
    public void cetakData() {
        System.out.println("PC: Data dicetak");
    }
}
