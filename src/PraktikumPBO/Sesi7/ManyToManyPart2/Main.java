package PraktikumPBO.Sesi7.ManyToManyPart2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("Dr. Ahmad", "D001");

        // Membuat objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("Pemrograman", "MK101");
        MataKuliah matkul2 = new MataKuliah("Basis Data", "MK102");

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Rina", "M001");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "M002");

        // Menetapkan dosen wali dan menambahkan mahasiswa bimbingan
        dosen1.tambahMahasiswa(mahasiswa1);
        dosen1.tambahMahasiswa(mahasiswa2);

        // Menambahkan mata kuliah yang diikuti oleh mahasiswa
        mahasiswa1.addMataKuliah(matkul1);
        mahasiswa1.addMataKuliah(matkul2);
        mahasiswa2.addMataKuliah(matkul1);

        // Menampilkan informasi dosen, mahasiswa, dan mata kuliah
        System.out.println("Informasi Dosen:");
        dosen1.displayInfo();

        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa1.displayInfo();
        mahasiswa2.displayInfo();

        System.out.println("\nInformasi Mata Kuliah:");
        matkul1.displayInfo();
        matkul2.displayInfo();
    }
}
