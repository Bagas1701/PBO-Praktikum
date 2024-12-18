package PraktikumPBO.Sesi6;
import java.util.Scanner;

class Waktu {
    private int menitWaktu; // Menyimpan jumlah menit sejak jam 00:00

    public Waktu() {
        this.menitWaktu = 0; // Inisialisasi menitWaktu dengan 0
    }

    public int getJam() {
        return menitWaktu / 60; // Menghitung jam dari total menit
    }

    public int getMenit() {
        return menitWaktu % 60; // Menghitung sisa menit dari total menit
    }

    public void setJam(int j) {
        if (j < 0) {
            throw new IllegalArgumentException("Jam tidak boleh negatif.");
        }
        menitWaktu = j * 60 + getMenit(); // Mengatur jam
    }

    public void setMenit(int m) {
        if (m < 0) {
            throw new IllegalArgumentException("Menit tidak boleh negatif.");
        }
        menitWaktu = getJam() * 60 + m; // Mengatur menit
    }

    public int getTotalMenit() {
        return menitWaktu; // Mengembalikan total menit
    }

    public void tambahJam(int j) {
        if (j < 0) {
            throw new IllegalArgumentException("Jam yang ditambahkan tidak boleh negatif.");
        }
        menitWaktu += j * 60; // Menambah jam
    }

    public void tambahMenit(int m) {
        if (m < 0) {
            throw new IllegalArgumentException("Menit yang ditambahkan tidak boleh negatif.");
        }
        menitWaktu += m; // Menambah menit
    }

    public void tambahWaktu(int j, int m) {
        tambahJam(j); // Menambah jam
        tambahMenit(m); // Menambah menit
    }

    public void tampilWaktu() {
        int jam = getJam();
        int menit = getMenit();
        System.out.printf("%02d:%02d\n", jam, menit); // Menampilkan waktu dalam format HH:MM
    }

    public void rasioJamTerhadapMenit() {
        int jam = getJam();
        int totalMenit = getTotalMenit();
        if (totalMenit > 0) {
            double rasio = (double) totalMenit / (jam * 60);
            System.out.printf("Rasio jam terhadap total menit: %.2f\n", rasio);
        } else {
            System.out.println("Total menit tidak dapat dihitung.");
        }
    }
}

public class waktuTesterInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Waktu waktu = new Waktu();

        // Mengatur jam dan menit menggunakan input pengguna
        System.out.print("Masukkan jam (0-23): ");
        int jam = scanner.nextInt();
        waktu.setJam(jam);

        System.out.print("Masukkan menit (0-59): ");
        int menit = scanner.nextInt();
        waktu.setMenit(menit);

        System.out.println("Waktu saat ini:");
        waktu.tampilWaktu(); // Menampilkan waktu saat ini
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah jam menggunakan input pengguna
        System.out.print("Masukkan jam yang ingin ditambahkan: ");
        int jamTambah = scanner.nextInt();
        waktu.tambahJam(jamTambah);
        System.out.println("Setelah menambah " + jamTambah + " jam:");
        waktu.tampilWaktu();
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah menit menggunakan input pengguna
        System.out.print("Masukkan menit yang ingin ditambahkan: ");
        int menitTambah = scanner.nextInt();
        waktu.tambahMenit(menitTambah);
        System.out.println("Setelah menambah " + menitTambah + " menit:");
        waktu.tampilWaktu();
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        // Menambah waktu secara bersamaan
        System.out.print("Masukkan jam dan menit yang ingin ditambahkan (jam menit): ");
        int jamTambah2 = scanner.nextInt();
        int menitTambah2 = scanner.nextInt();
        waktu.tambahWaktu(jamTambah2, menitTambah2);
        System.out.println("Setelah menambah " + jamTambah2 + " jam dan " + menitTambah2 + " menit:");
        waktu.tampilWaktu();
        waktu.rasioJamTerhadapMenit(); // Menampilkan rasio jam terhadap total menit

        scanner.close(); // Menutup scanner
    }
}
