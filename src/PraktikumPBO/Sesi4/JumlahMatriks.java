package PraktikumPBO.Sesi4;

public class JumlahMatriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int jumlah = 0;

        // looping utnuk menghitung jumlah elemen dalam matriks
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                jumlah += matriks[i][j];
            }
        }

        System.out.println("jumlah elemen dalam matriks: " + jumlah);
    }
    
}
