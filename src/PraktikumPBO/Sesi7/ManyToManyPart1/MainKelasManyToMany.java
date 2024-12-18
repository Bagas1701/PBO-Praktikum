package PraktikumPBO.Sesi7.ManyToManyPart1;

import java.util.ArrayList;
import java.util.List;

// Kelas untuk Kelas yang diikuti Mahasiswa
class Kelas { 
    private String namaKelas; 
    private String kodeKelas; 
    private List<Mahasiswa> mahasiswaList; 
 
    // Constructor
    public Kelas(String namaKelas, String kodeKelas) { 
        this.namaKelas = namaKelas; 
        this.kodeKelas = kodeKelas; 
        this.mahasiswaList = new ArrayList<>(); 
    } 
 
    // Getter dan Setter
    public String getNamaKelas() { 
        return namaKelas; 
    } 
 
    public void setNamaKelas(String namaKelas) { 
        this.namaKelas = namaKelas; 
    } 
 
    public String getKodeKelas() { 
        return kodeKelas; 
    } 
 
    public void setKodeKelas(String kodeKelas) { 
        this.kodeKelas = kodeKelas; 
    } 
 
    public List<Mahasiswa> getMahasiswaList() { 
        return mahasiswaList; 
    } 
 
    // Metode untuk menambahkan Mahasiswa ke dalam Kelas
    public void addMahasiswa(Mahasiswa mahasiswa) { 
        if (!mahasiswaList.contains(mahasiswa)) { 
            mahasiswaList.add(mahasiswa); 
            mahasiswa.addKelas(this); // Menghindari duplikasi
        } 
    } 
 
    // Metode untuk menampilkan info Kelas
    public void displayInfo() { 
        System.out.println("Kelas: " + namaKelas + " (" + kodeKelas + ")"); 
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) { 
            System.out.println("- " + mhs.getNama()); 
        } 
    } 
} 

// Modifikasi pada kelas Mahasiswa untuk mendukung relasi Many-to-Many
class Mahasiswa { 
    private String nama; 
    private String nim; 
    private int usia; 
    private Jurusan jurusan; 
    private List<Kelas> kelasList; 
 
    // Constructor
    public Mahasiswa(String nama, String nim, int usia, Jurusan jurusan) { 
        this.nama = nama; 
        this.nim = nim; 
        this.usia = usia; 
        this.jurusan = jurusan; 
        this.kelasList = new ArrayList<>(); 
    } 
 
    // Getter dan Setter
    public String getNama() { 
        return nama; 
    } 
 
    public void setNama(String nama) { 
        this.nama = nama; 
    } 
 
    public List<Kelas> getKelasList() { 
        return kelasList; 
    } 
 
    // Metode untuk menambahkan Kelas ke dalam daftar Mahasiswa
    public void addKelas(Kelas kelas) { 
        if (!kelasList.contains(kelas)) { 
            kelasList.add(kelas); 
            kelas.addMahasiswa(this); // Menghindari duplikasi
        } 
    } 
 
    // Metode untuk menampilkan info Mahasiswa
    public void displayInfo() { 
        System.out.println("Nama: " + nama); 
        System.out.println("NIM: " + nim); 
        System.out.println("Usia: " + usia); 
        if (jurusan != null) { 
            System.out.println("Jurusan: " + jurusan.getNama()); 
        } 
        System.out.println("Kelas yang diikuti:");
        for (Kelas kelas : kelasList) { 
            System.out.println("- " + kelas.getNamaKelas()); 
        } 
    } 
} 

// Kelas Jurusan
class Jurusan {
    private String nama;
    private String kode;

    // Constructor
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

public class MainKelasManyToMany { 
    public static void main(String[] args) { 
        // Membuat objek Jurusan
        Jurusan jurusanInformatika = new Jurusan("Informatika", "IF123"); 
 
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21, jurusanInformatika); 
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "87654321", 22, jurusanInformatika); 
 
        // Membuat objek Kelas
        Kelas kelasPemrograman = new Kelas("Pemrograman Java", "PJ101"); 
        Kelas kelasBasisData = new Kelas("Basis Data", "BD102"); 
 
        // Menambahkan Mahasiswa ke dalam Kelas
        kelasPemrograman.addMahasiswa(mahasiswa1); 
        kelasPemrograman.addMahasiswa(mahasiswa2); 
        kelasBasisData.addMahasiswa(mahasiswa1); 
 
        // Menampilkan data Kelas dan Mahasiswa
        System.out.println("Informasi Mahasiswa:"); 
        mahasiswa1.displayInfo(); 
        mahasiswa2.displayInfo(); 
 
        System.out.println("\nInformasi Kelas:"); 
        kelasPemrograman.displayInfo(); 
        kelasBasisData.displayInfo(); 
    } 
}

