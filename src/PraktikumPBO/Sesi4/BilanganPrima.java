package PraktikumPBO.Sesi4;

public class BilanganPrima {
    public static void main(String[] args) {
        int batasBawah = 2, batasAtas = 30;

        System.out.println("Bilangan prima antara " + batasBawah + " dan " + batasAtas + " adalah: ");

        //looping untuk setiap angka dalam rentang
        for (int i = batasBawah; i <= batasAtas; i++) {
            boolean prima = true;

            // cek apakah angka prima
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.println(i + " ");
            }
        }
    }
    
}
