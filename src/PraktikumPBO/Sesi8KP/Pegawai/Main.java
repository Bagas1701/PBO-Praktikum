package PraktikumPBO.Sesi8KP.Pegawai;

public class Main {
    public static void main(String[] args) {
        //Membuat sebuah object
        //"pegawai" merupakan class, lalu "Pegawai" merupakan objek yang 
        //akan dibuat, lalu "new pegawai();" merupakan constructor.
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        //memasukkan nilai variabel menggunakan objek.
        manager.nama = "Sifa";
        manager.id_pegawai = 1;
        manager.gaji ="7 juta";

        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1,2 juta";

        koki.nama = "Reza";
        koki.id_pegawai = 3;
        koki.gaji = "2 juta";

        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 juta";

        satpam.nama = "Adi";
        satpam.id_pegawai = 2;
        satpam.gaji = "1 juta";
        // nilai tersebut akan dimasukkan
        // kedalam variabel yang ada pada superclass.
        // memanggil fungsi pada superclass
        pegawai.menampilkan();
        //memanggik nilai variabel pada superclass dan 
        //memasukkannya kedalam fungsi yang ada pada class;
        manager.menampilkan();
        manager.tugas();

        kasir.menampilkan();
        kasir.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();;
        satpam.tugas();
    }
}
