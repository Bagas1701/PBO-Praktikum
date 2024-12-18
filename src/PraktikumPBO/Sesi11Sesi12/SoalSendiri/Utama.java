package PraktikumPBO.Sesi11Sesi12.SoalSendiri;
// Kelas abstrak
abstract class Bentuk {
    public abstract double hitungLuas(); // Metode abstrak
}

// Interface
interface Cetak {
    void cetak(); // Metode untuk mencetak detail
}

// Subkelas
class Lingkaran extends Bentuk implements Cetak {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public void cetak() {
        System.out.println("Lingkaran dengan jari-jari: " + jariJari);
        System.out.println("Luas: " + hitungLuas());
    }

    // Metode statis untuk mencetak pesan utilitas
    public static void cetakPesanUtilitas() {
        System.out.println("Program ini menghitung luas lingkaran dan mencetak detailnya.");
    }
}

// Kelas utama
public class Utama {
    public static void main(String[] args) {
        Lingkaran.cetakPesanUtilitas(); // Memanggil metode statis

        Lingkaran lingkaran = new Lingkaran(5.0); // Membuat objek Lingkaran
        lingkaran.cetak(); // Mencetak detail lingkaran
    }
}
