package TA10;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nNo 1 : ");
        bentuk1 pp = new persegiPanjang1(5, 4);
        bentuk1 S = new Segitiga1(6, 3);
        bentuk1 L = new lingkaran1(7);

        pp.tampilkan();
        S.tampilkan();
        L.tampilkan();
    
        System.out.println("\nNo 2 :");
        dataUniv2 u = new univ2();
        u.tampilData();
        
        System.out.println("\nNo 3 :");
        mhs3 m = new mhs3("Reyhan", "Cianjur");
        m.info();
        m.nama = "Reyhan";
        m.alamat = "Ciranjang";
        
        System.out.println("\nNo 5 :");
        dosen5 d = new dosen5();
        d.setNama("Budi");
        d.setAlamat("Bandung");

        System.out.println("Nama   : " + d.getNama());
        System.out.println("Alamat : " + d.getAlamat());
        
        System.out.println("\nNo 6 :");
        guru6 sw = new siswa6("Siti", "Jakarta");
        sw.tampil();

        System.out.println("\nNo 7 :");
        mobil7 mbl = new mobil7();
        mbl.nama = "Avanza";
        mbl.jenis = "Darat";
        mbl.informasi();

        pesawat7 p = new pesawat7();
        p.nama = "Garuda";
        p.jenis = "Udara";
        p.informasi();

        kapalLaut7 k = new kapalLaut7();
        k.nama = "Pelni";
        k.jenis = "Laut";
        k.informasi();
    }
}

