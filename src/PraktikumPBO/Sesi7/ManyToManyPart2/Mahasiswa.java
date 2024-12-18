package PraktikumPBO.Sesi7.ManyToManyPart2;
import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen dosenWali;
    private List<MataKuliah> mataKuliahList;
    // Konstruktor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.mataKuliahList = new ArrayList<>();
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NIM
    public String getNim() {
        return nim;
    }

    // Getter untuk dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Setter untuk dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Menambahkan mata kuliah ke dalam daftar mahasiswa
    public void addMataKuliah(MataKuliah mataKuliah) {
        if (!mataKuliahList.contains(mataKuliah)) {
            mataKuliahList.add(mataKuliah);
            mataKuliah.addMahasiswa(this); // Menjaga relasi dua arah
        }
    }

    // Menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum Ada"));
        System.out.println("Mata Kuliah yang Diikuti:");
        for (MataKuliah mk : mataKuliahList) {
            System.out.println("- " + mk.getNama());
        }
    }
}
