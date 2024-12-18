package PraktikumPBO.Sesi7.ManyToManyPart2;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String nama;
    private String kode;
    private List<Mahasiswa> mahasiswaList;

    // Konstruktor
    public MataKuliah(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
        this.mahasiswaList = new ArrayList<>();
    }

    // Getter untuk nama mata kuliah
    public String getNama() {
        return nama;
    }

    // Getter untuk kode mata kuliah
    public String getKode() {
        return kode;
    }

    // Menambahkan mahasiswa ke dalam daftar mata kuliah
    public void addMahasiswa(Mahasiswa mahasiswa) {
        if (!mahasiswaList.contains(mahasiswa)) {
            mahasiswaList.add(mahasiswa);
            mahasiswa.addMataKuliah(this); // Menjaga relasi dua arah
        }
    }

    // Menampilkan informasi mata kuliah
    public void displayInfo() {
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("Kode: " + kode);
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.println("- " + mhs.getNama());
        }
    }
}
