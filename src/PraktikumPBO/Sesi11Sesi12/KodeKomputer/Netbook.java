package PraktikumPBO.Sesi11Sesi12.KodeKomputer;

class Netbook extends Komputer {
    @Override
    void hidupkanOS() {
        System.out.println("Netbook: OS dihidupkan");
    }

    @Override
    void matikanOS() {
        System.out.println("Netbook: OS dimatikan");
    }

    @Override
    public void klikKanan() {
        System.out.println("Netbook: Klik kanan mouse");
    }

    @Override
    public void klikKiri() {
        System.out.println("Netbook: Klik kiri mouse");
    }

    @Override
    public void tekanEnter() {
        System.out.println("Netbook: Tekan tombol Enter");
    }

    @Override
    public void cetakData() {
        System.out.println("Netbook: Data dicetak");
    }
}
