package PraktikumPBO.Sesi4;
import java.util.Scanner;
import javax.print.DocFlavor.STRING;
//program SWITCH
public class LampuLaluLintas {
    public static void main(String[] args) {
        //mengambil variabel dari Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        // Mengambil Input
        System.out.println(" Inputkan Nama Warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati - hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, Silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu salah");
            }
        }
}
