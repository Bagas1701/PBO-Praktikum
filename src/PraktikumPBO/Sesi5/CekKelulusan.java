package PraktikumPBO.Sesi5;
import java.util.Scanner;

// Class untuk mengecek kelulusan
class Kelulusan {
    // Atribut
    private String nama;
    private int nilai;

    // Constructor
    public Kelulusan(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Method untuk mengecek kelulusan
    public void cekKelulusan() {
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }
    }
}

// Program utama
public class CekKelulusan {
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        String nama;
        int nilai;
        Scanner scan = new Scanner(System.in);

        // Mengambil input dari user
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();

        // Membuat objek dari class Kelulusan dan cek kelulusan
        Kelulusan kelulusan = new Kelulusan(nama, nilai);
        kelulusan.cekKelulusan();
    }
}
