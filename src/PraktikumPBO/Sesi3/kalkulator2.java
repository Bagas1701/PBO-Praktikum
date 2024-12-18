package PraktikumPBO.Sesi3; // Mendefinisikan paket untuk kelas ini

import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class kalkulator2 { // Mendefinisikan kelas kalkulator
    public static void main(String[] args) { // Metode utama yang menjadi titik awal eksekusi program
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input

        int a, b, c; // Mendeklarasikan tiga variabel integer: a, b untuk bilangan dan c untuk pilihan operasi
        char repeat; // Mendeklarasikan variabel char untuk menyimpan pilihan pengguna untuk mengulang operasi
        
        do { // Memulai loop do-while untuk melakukan operasi berulang
            System.out.print("Masukkan bilangan pertama = "); // Meminta pengguna untuk memasukkan bilangan pertama
            a = input.nextInt(); // Membaca input bilangan pertama dan menyimpannya di variabel a

            System.out.print("Masukkan bilangan kedua = "); // Meminta pengguna untuk memasukkan bilangan kedua
            b = input.nextInt(); // Membaca input bilangan kedua dan menyimpannya di variabel b

            // Menampilkan pilihan operasi yang tersedia
            System.out.println("\nPilihan Operasi bilangan (kalkulator)");
            System.out.println("1. (+) untuk pertambahan");
            System.out.println("2. (-) untuk pengurangan");
            System.out.println("3. (*) untuk perkalian");
            System.out.println("4. (/) untuk pembagian");
            System.out.println("5. Semua operasi bilangan");

            System.out.print("\nPilihlah operasi bilangan = "); // Meminta pengguna untuk memilih operasi
            c = input.nextInt(); // Membaca pilihan operasi yang dipilih oleh pengguna

            // Struktur switch untuk menentukan tindakan berdasarkan pilihan operasi
            switch(c) {
                case 1: // Jika pengguna memilih 1
                    System.out.println("Hasilnya = " + (a + b)); // Menampilkan hasil pertambahan
                    break; // Menghentikan eksekusi switch
                
                case 2: // Jika pengguna memilih 2
                    System.out.println("Hasilnya = " + (a - b)); // Menampilkan hasil pengurangan
                    break; // Menghentikan eksekusi switch
                
                case 3: // Jika pengguna memilih 3
                    System.out.println("Hasilnya = " + (a * b)); // Menampilkan hasil perkalian
                    break; // Menghentikan eksekusi switch
                
                case 4: // Jika pengguna memilih 4
                    if(b != 0) // Memastikan bahwa b tidak sama dengan 0 untuk menghindari pembagian dengan nol
                        System.out.println("Hasilnya = " + (a / b)); // Menampilkan hasil pembagian
                    else // Jika b sama dengan 0
                        System.out.println("Pembagian dengan 0 tidak diizinkan"); // Menampilkan pesan error
                    break; // Menghentikan eksekusi switch
                
                case 5: // Jika pengguna memilih 5
                    // Menampilkan semua hasil operasi
                    System.out.println("\nHasil pertambahan = " + (a + b));
                    System.out.println("Hasil pengurangan = " + (a - b));
                    System.out.println("Hasil perkalian = " + (a * b));
                    if(b != 0) // Memastikan bahwa b tidak sama dengan 0
                        System.out.println("Hasil pembagian = " + (a / b)); // Menampilkan hasil pembagian
                    else // Jika b sama dengan 0
                        System.out.println("Pembagian dengan 0 tidak diizinkan"); // Menampilkan pesan error
                    break; // Menghentikan eksekusi switch
                
                default: // Jika pengguna memasukkan pilihan yang tidak valid
                    System.out.println("Operasi tidak valid"); // Menampilkan pesan error
            }

            // Menanyakan kepada pengguna jika mereka ingin melakukan operasi lagi
            System.out.print("\nApakah Anda ingin melakukan operasi lagi? (y/n): "); // Meminta input pengguna
            repeat = input.next().charAt(0); // Membaca karakter pertama dari input pengguna untuk menentukan apakah ingin mengulang
            
        } while(repeat == 'y' || repeat == 'Y'); // Melanjutkan loop selama pengguna memasukkan 'y' atau 'Y'

        input.close(); // Menutup objek Scanner untuk mencegah kebocoran memori
    }
}
