package PraktikumPBO.Quiz;

class Pakaian {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    // Setter untuk nama, stok, dan harga satuan
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    // Getter untuk nama, stok, harga satuan, dan harga total
    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getHargaTotal() {
        hargaTotal = stok * hargaSatuan;
        return hargaTotal;
    }

    // Method untuk menampilkan informasi pakaian
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Stok: " + getStok());
        System.out.println("Harga Satuan: Rp " + getHargaSatuan());
        System.out.println("Harga Total: Rp " + getHargaTotal());
    }
}

public class MainPakaian {
    public static void main(String[] args) {
        // Membuat objek kemeja
        Pakaian kemeja = new Pakaian();
        kemeja.setNama("Kemeja");
        kemeja.setStok(10);
        kemeja.setHargaSatuan(50000);

        // Membuat objek celana
        Pakaian celana = new Pakaian();
        celana.setNama("Celana");
        celana.setStok(10);
        celana.setHargaSatuan(75000);

        // Membuat objek jaket
        Pakaian jaket = new Pakaian();
        jaket.setNama("Jaket");
        jaket.setStok(10);
        jaket.setHargaSatuan(100000);

        // Menampilkan informasi masing-masing pakaian
        System.out.println("Informasi Pakaian:");
        kemeja.tampilkanInfo();
        System.out.println();
        celana.tampilkanInfo();
        System.out.println();
        jaket.tampilkanInfo();
        System.out.println();

        // Menghitung total harga jika semua pakaian terjual habis
        int totalPendapatan = kemeja.getHargaTotal() + celana.getHargaTotal() + jaket.getHargaTotal();
        System.out.println("Total Pendapatan jika semua pakaian terjual habis: Rp " + totalPendapatan);
    }
}
