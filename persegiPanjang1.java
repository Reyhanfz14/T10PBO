package TA10;


public class persegiPanjang1 extends bentuk1 {
    double panjang, lebar;

    public persegiPanjang1(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama);
        System.out.println("Luas = " + luas());
    }
}

