package PraktikumPBO.Sesi4;
import java.util.Scanner;


public class CekKelulusan {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
        // mengambil input
        System.out.println("Nama : "); nama = scan.nextLine();
        System.out.println("Nilai : "); nilai = scan.nextInt();
        // cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }
    }
    
}
