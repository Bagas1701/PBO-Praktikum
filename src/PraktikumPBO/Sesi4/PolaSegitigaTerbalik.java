package PraktikumPBO.Sesi4;

public class PolaSegitigaTerbalik {
    public static void main(String[] args) {
        int tinggi = 5;


        //looping untuk tiap baris
        for (int i = tinggi; i >= 1; i--){
            // Looping untuk spasi
            for (int j = 1; j <= tinggi - i; j++){
                System.out.println(" ");
            }
            //Looping untuk bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.println("*");
            }
            // Pindah ke baris baru
            System.out.println();
        }
    }   
}
