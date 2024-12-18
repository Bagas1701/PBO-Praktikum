package PraktikumPBO.Sesi3;
// Program Operation Aritmatika
// dibuat 2 oktober 2024
// dibuat oleh arief
import java.util.Scanner;
public class Aritmatika {
    public static void main(String[] args) {

        // membuat objek scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka Kedua: ");
        double angka2 = input.nextDouble();

        // Melakukan operasi aritmatika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        double pembagian = angka1 / angka2;

        // Menampilkan Hasil
        System.out.println("Hasil Penjumlahan: " + penjumlahan);
        System.out.println("Hasil Pengurangan: " + pengurangan);
        System.out.println("Hasil Perkalian: " + perkalian);
        System.out.println("Hasil Pembagian: " + pembagian);
        
        //Menutup Scanner
        input.close();
    }
}