package PraktikumPBO.Sesi6;
class Siswa {
    private String nama;
    private int nilaiUjian;

    //constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian);
    }

    //Getter untuk nama
    public String getNama() {
        return nama;
    }

    //setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nilai Ujian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    // setter untuk nilai ujian
    public void setNilaiUjian(int nilaiUjian) {
        // Validasi nilai (0-100)
        if (nilaiUjian >= 0 && nilaiUjian <=100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }

    // Metode untuk menampilkan informasi siswa
    public void tampilkanInfo () {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Nilai Ujian: " + nilaiUjian);
    }
}
// Kelas Utama untuk menjalankan program
public class SiswaTester {
    public static void main(String[] args) {
        // Membuat objek siswa
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();

        // Menggunakan setter untuk mengubah nama dan nilai ujian
        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        // Menampilkan informasi yan telah diperbarui
        System.out.println("\nSetelah Diubah:");
        siswa1.tampilkanInfo();

        // menguji validasi dengan memasukkan nilai yang tidak valid
        siswa1.setNilaiUjian(105); //Output: Nilai harus antara 0 dan 100.
    }
    
}
