package TA10;


public class Segitiga1 extends bentuk1 {
    private double alas, tinggi;

    public Segitiga1(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama);
        System.out.println("Luas = " + luas());
    }
}

