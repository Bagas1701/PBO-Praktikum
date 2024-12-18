package PraktikumPBO.Sesi6;
class Mobil {
    public String merk;
    protected int tahunProduksi;
    private double harga;

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter untuk atribut private harga
    public double getHarga() {
        return harga;
    }

    // setter untuk atribut private harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    //Metode untuk tampilan mobil
    public void tampilkanInfoMobil() {
        System.out.println("merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}

// Kelas Utama untuk menjalankan program
public class MobilCek {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 30000000);

        // Mengakses atribut public
        System.out.println("Merk Mobil: " + mobil1.merk);

        // mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi);

        // Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobil1.getHarga());

        //Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(350000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga());

        // Menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();
    }
    
}
