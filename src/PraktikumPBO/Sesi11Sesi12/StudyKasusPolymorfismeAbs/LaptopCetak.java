package PraktikumPBO.Sesi11Sesi12.StudyKasusPolymorfismeAbs;

// final class
public final class LaptopCetak {
    // final variabel/konstanta
    private final String barang = "Laptop";
    // final method
    private final void cetak(Laptop[] ob, String pemilik) {
        System.out.println("Nama Barang : "+barang);
        System.out.println(" ");
        // polimorfisme
        for (int i=0; i<ob.length; i++) {
            ob[i].getMerk();
            ob[i].setPemilik(pemilik);
            ob[i].getPemilik();
            ob[i].tampil();
            ob[i].hapus();
            System.out.println("########################");
        }
        ob = null;
        pemilik = null;
    }

    public static void main(String[] args) {
        String pemilik = "Ahmad";
        Laptop[] ob = {
            new LaptopAsus("Asus"),
            new LaptopDell("Dell"),
        }
    }
}
