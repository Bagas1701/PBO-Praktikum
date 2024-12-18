package PraktikumPBO.Quiz;

class AlatTulis {
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

    // Method untuk menampilkan informasi alat tulis
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Stok: " + getStok());
        System.out.println("Harga Satuan: Rp " + getHargaSatuan());
        System.out.println("Harga Total: Rp " + getHargaTotal());
    }
}

public class MainAlatTulis {
    public static void main(String[] args) {
        // Membuat objek bolpoin
        AlatTulis bolpoin = new AlatTulis();
        bolpoin.setNama("Bolpoin");
        bolpoin.setStok(10);
        bolpoin.setHargaSatuan(2000);

        // Membuat objek pensil
        AlatTulis pensil = new AlatTulis();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        // Membuat objek penghapus
        AlatTulis penghapus = new AlatTulis();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        // Menampilkan informasi masing-masing alat tulis
        System.out.println("Informasi Alat Tulis:");
        bolpoin.tampilkanInfo();
        System.out.println();
        pensil.tampilkanInfo();
        System.out.println();
        penghapus.tampilkanInfo();
        System.out.println();

        // Menghitung total harga jika semua alat tulis terjual habis
        int totalPendapatan = bolpoin.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();
        System.out.println("Total Pendapatan jika semua alat tulis terjual habis: Rp " + totalPendapatan);
    }
}
