package PraktikumPBO.Sesi4;
import java.util.Scanner;
public class HitungRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahNilai = 0;
        double totalNilai = 0;
        char lanjut;

        do {
            System.out.println("Masukkan nilai: ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
            jumlahNilai++;

            System.out.println("Apakah Anda ingin memasukkan nilai lain? (y/n): ");
            lanjut = input.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');
        
        double rataRata = totalNilai / jumlahNilai;
        System.out.println("rata-rata nilai: " + rataRata);
    }
    
}
