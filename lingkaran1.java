package TA10;

public class lingkaran1 extends bentuk1 {
    double r;

    public lingkaran1(double r) {
        super("Lingkaran");
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama);
        System.out.println("Luas = " + luas());
    }
}
