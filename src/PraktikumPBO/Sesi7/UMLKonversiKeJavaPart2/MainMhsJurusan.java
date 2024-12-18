package PraktikumPBO.Sesi7.UMLKonversiKeJavaPart2;

// Kelas Jurusan
class Jurusan {
    private String nama;
    private String kode;

    // Konstruktor
    public Jurusan(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    // Metode untuk menampilkan info Jurusan
    public void displayInfo() {
        System.out.println("Nama Jurusan: " + nama);
        System.out.println("Kode Jurusan: " + kode);
    }
}

// Kelas Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;
    private Jurusan jurusan; // Relasi "has-a" dengan Jurusan

    // Konstruktor
    public Mahasiswa(String nama, String nim, int usia, Jurusan jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    // Metode untuk menampilkan info Mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        if (jurusan != null) {
            System.out.println("Jurusan: ");
            jurusan.displayInfo();
        }
    }
}

// Kelas Main untuk menjalankan program
public class MainMhsJurusan {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123");

        // Membuat objek Mahasiswa dengan Jurusan
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika);

        // Menampilkan data Mahasiswa beserta Jurusannya
        mahasiswa1.displayInfo();

        // Mengubah data Jurusan Mahasiswa
        Jurusan jurusanSistemInformasi = new Jurusan("Sistem Informasi", "SI456");
        mahasiswa1.setJurusan(jurusanSistemInformasi);

        // Menampilkan data setelah perubahan
        mahasiswa1.displayInfo();
    }
}
