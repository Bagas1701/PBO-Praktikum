package PraktikumPBO.Sesi11Sesi12.KodeKomputer;

class Laptop extends Komputer {
    @Override
    void hidupkanOS() {
        System.out.println("Laptop: OS dihidupkan");
    }

    @Override
    void matikanOS() {
        System.out.println("Laptop: OS dimatikan");
    }

    @Override
    public void klikKanan() {
        System.out.println("Laptop: Klik kanan mouse");
    }

    @Override
    public void klikKiri() {
        System.out.println("Laptop: Klik kiri mouse");
    }

    @Override
    public void tekanEnter() {
        System.out.println("Laptop: Tekan tombol Enter");
    }

    @Override
    public void cetakData() {
        System.out.println("Laptop: Data dicetak");
    }
}
