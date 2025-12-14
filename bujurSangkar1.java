package TA10;

public class bujurSangkar1 extends bentuk1 {

    private double sisi;

    public bujurSangkar1(double sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama);
        System.out.println("Panjang sisi = " + sisi);
        System.out.println("Luas = " + luas());
    }
}

