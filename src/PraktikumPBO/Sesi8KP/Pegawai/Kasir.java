package PraktikumPBO.Sesi8KP.Pegawai;

public class Kasir extends Pegawai{
    @Override
    public void menampilkan(){
        System.out.println("Nama : "+nama);
        System.out.println("Id_Pegawai : "+id_pegawai);
        System.out.println("Gaji : "+gaji);
    }

    public void tugas(){
        System.out.println("Tugas : Melakukan transaksi dengan pembeli");
        System.out.println("--------------------------------------------");
    }
}