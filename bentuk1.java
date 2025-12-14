package TA10;


public abstract class bentuk1 {
    
    protected String nama; //No.4 Ubah hak akses superclass(turunanya doang)

    public bentuk1(String nama) {
        this.nama = nama;
    }

    public abstract double luas();
    public abstract void tampilkan();

}
