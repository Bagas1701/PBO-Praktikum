package PraktikumPBO.Sesi6;

public class Main {
    public static void main(String[] args) {
        //================Mahasiswa=============
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21,  "Teknik Informatika");

        // Mengakses atribut Public
        System.out.println("Nama Mahasiswa: " + mahasiswa1.nama); // Output: Andi

        // Mengakses atribut Protected (dapat diakses dalam package yang sama)
        System.out.println("Usia Mahasiswa: " + mahasiswa1.usia); // Output: 21

        // Mengakses atribut Private menggunakan getter
        System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan()); // Output: Teknik Informatika

        // Mengubah nilai atribut private menggunakan setter
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("\nJurusan Mahasiswa Setelah Diubah : " + mahasiswa1.getJurusan()); // Output: Sistem Informasi

        // Menampilkan informasi lengkap mahasiswa
        mahasiswa1.tampilkanInfo();

        System.out.println();

        //==============Siswa==============
        //membuat objek Siswa
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();

        //Menggunakan setter untuk mengubah nama dan nilai ujian
        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        //menampilkan informasi yang telah diperbarui
        System.out.println("\nSetelah Diubah: ");
        siswa1.tampilkanInfo();

        //menguji validasi dengan memasukan nilai yang tidak valid
        siswa1.setNilaiUjian(105);// output nilai harus anatar 0 dan 100

        System.out.println();

        //=================Mobil===============
        //membuat objek mobil
         Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

         //mengakses atribut public
         System.out.println("Merk Mobil: " +mobil1.merk);    //Ouput: Toyota
 
         //mengakses atribut protected (dapat diakses dalam package yang sama)
         System.out.println("Tahun Produksi Mobil: " +mobil1.tahunProduksi);    //Ouput: 2022
         
         //mengakses atribut private menggunakan getter
         System.out.println("Harga Mobil: " +mobil1.getHarga());    //Ouput: 30000000.0
 
         //mengubah nilai atribut private menggunakan setter
         mobil1.setHarga(350000000);
         System.out.println("Harga Mobil Setelah Diubah: " + mobil1.getHarga()); // Output 35000000.0
 
         //menampilkan informasi lengakp mobil
         mobil1.tampilkanInfoMobil();

         System.out.println();

         // ================Nilai=================
        setterNilai n = new setterNilai();
        n.setQuis(90);
        n.setUTS(70);
        n.setUAS(150); // Akan menghasilkan pesan error karena nilai UAS di luar rentang
        System.out.println("NA: " + n.getNA());

        // Menampilkan Informasi lengkap Nilai
        System.out.println();

        // ==================Waktu=================
        Waktu waktu = new Waktu();
        // Mengatur jam dan menit dengan nilai tetap
        waktu.setJam(2);    // Set jam ke 2
        waktu.setMenit(30); // Set menit ke 30

        System.out.println("Waktu saat ini:");
        waktu.tampilWaktu(); // Menampilkan waktu: 02:30
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah jam
        waktu.tambahJam(1); // Menambah 1 jam
        System.out.println("Setelah menambah 1 jam:");
        waktu.tampilWaktu(); // Menampilkan waktu: 03:30
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah menit
        waktu.tambahMenit(45); // Menambah 45 menit
        System.out.println("Setelah menambah 45 menit:");
        waktu.tampilWaktu(); // Menampilkan waktu: 04:15
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah waktu secara bersamaan
        waktu.tambahWaktu(0, 30); // Menambah 30 menit
        System.out.println("Setelah menambah 30 menit:");
        waktu.tampilWaktu(); // Menampilkan waktu: 04:45
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit
        System.out.println();
    }
}