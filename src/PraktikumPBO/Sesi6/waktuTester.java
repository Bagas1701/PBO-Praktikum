package PraktikumPBO.Sesi6;
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


public class waktuTester {
    public static void main(String[] args) {
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
    }
}