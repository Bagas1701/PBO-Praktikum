package PraktikumPBO.Sesi11Sesi12.KodeKomputer;

final class KomputerCetak {
    public final void cetak(Komputer[] obj) {
        for (Komputer k : obj) {
            k.hidupkanOS();
            k.klikKanan();
            k.klikKiri();
            k.tekanEnter();
            k.cetakData();
            k.matikanOS();
            System.out.println();
        }
    }
}