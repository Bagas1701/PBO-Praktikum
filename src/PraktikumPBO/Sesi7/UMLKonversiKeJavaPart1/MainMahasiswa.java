package PraktikumPBO.Sesi7.UMLKonversiKeJavaPart1;

class Mahasiswa { 
    // Atribut private 
    private String nama; 
    private String nim; 
    private int usia; 
 
    // Constructor 
    public Mahasiswa(String nama, String nim, int usia) { 
        this.nama = nama; 
        this.nim = nim; 
        this.usia = usia; 
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
 
    // Metode untuk menampilkan data mahasiswa 
    public void displayInfo() { 
        System.out.println("Nama: " + nama); 
        System.out.println("NIM: " + nim); 
        System.out.println("Usia: " + usia); 
    } 
}

public class MainMahasiswa { 
    public static void main(String[] args) { 
        // Membuat objek Mahasiswa 
        Mahasiswa mahasiswa1 = new Mahasiswa("Ahmad", "12345678", 21); 
 
        // Mengakses dan menampilkan data Mahasiswa 
        mahasiswa1.displayInfo(); 
 
        // Mengubah data Mahasiswa 
        mahasiswa1.setNama("Budi"); 
        mahasiswa1.setNim("87654321"); 
        mahasiswa1.setUsia(22); 
 
        // Menampilkan data setelah diubah 
        mahasiswa1.displayInfo(); 
    } 
}
