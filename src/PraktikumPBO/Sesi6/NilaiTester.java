package PraktikumPBO.Sesi6;

class setterNilai {
    private double Quis;
    private double UTS;
    private double UAS;

    public void setQuis(double x) {
        if (x >= 0 && x <= 100) {
            Quis = x;
        } else {
            System.out.println("Nilai Quis harus antara 0 dan 100.");
        }
    }

    public void setUTS(double x) {
        if (x >= 0 && x <= 100) {
            UTS = x;
        } else {
            System.out.println("Nilai UTS harus antara 0 dan 100.");
        }
    }

    public void setUAS(double x) {
        if (x >= 0 && x <= 100) {
            UAS = x;
        } else {
            System.out.println("Nilai UAS harus antara 0 dan 100.");
        }
    }

    public double getQuis() {
        return Quis;
    }

    public double getUTS() {
        return UTS;
    }

    public double getUAS() {
        return UAS;
    }

    public double getNA() {
        return 0.20 * Quis + 0.30 * UTS + 0.50 * UAS;
    }
}

public class NilaiTester {
    public static void main(String[] args) {
        setterNilai n = new setterNilai();
        n.setQuis(90);
        n.setUTS(70);
        n.setUAS(150); // Akan menghasilkan pesan error karena nilai UAS di luar rentang
        System.out.println("NA: " + n.getNA());
    }
}
