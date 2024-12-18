package PraktikumPBO.Sesi11Sesi12.Abstract;

public class StaffTester {
    public static void main(String[] args) {
        Staff s = new Staff("Januari", "1234", "Keuangan");
        s.kirimEmail("a@test.com", "info test", "isi email");
        System.out.println("NIP : "+s.getNIP()+"\n"+"Nama : "+s.getNama()+"Bagian : "+s.getBagian());
    }
    
}
