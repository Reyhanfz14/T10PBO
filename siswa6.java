package TA10;

public class siswa6 extends guru6 {

    public siswa6(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    @Override
    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

