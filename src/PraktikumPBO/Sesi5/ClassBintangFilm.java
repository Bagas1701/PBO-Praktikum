package PraktikumPBO.Sesi5;

// Membuat Class dengan nama Bintang Film
class BintangFilm {
    // atributnya
    private String nama;
    private Boolean pria;

    // konstruktor : fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method tanpa return dengan parameter
    private void Isikan(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // method dengan return tanpa parameter
    String perolehNama() {
        return(nama);
    }

    // Memperoleh Jenis Kelamin dengan tanpa parameter
    String perolehJenisKelamin() {
        if (pria)
            return ("Pria");
        else
            return ("Wanita");
    }
}   


public class ClassBintangFilm {
    public static void main(String[] args) {
        // buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
