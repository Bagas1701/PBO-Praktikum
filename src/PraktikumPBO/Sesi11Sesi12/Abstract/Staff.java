package PraktikumPBO.Sesi11Sesi12.Abstract;

public class Staff extends Pegawai {
    private String bagian;
    public Staff(String nama, String NIP, String bagian) {
        super(nama, NIP);
        setBagian(bagian);
    }
    public void setBagian(String namaBagian) {
        bagian=namaBagian;
    }
    public String getBagian() {
        return bagian;
    }

    public void kirimEmail(String to, String subjek, String isi) {
        System.out.println(getNama() + " Kirim Email ke : "+to+"\n"+"Dengan Subjek : "+subjek+"\n"+ "Dengan isi : "+isi);
    }
}
