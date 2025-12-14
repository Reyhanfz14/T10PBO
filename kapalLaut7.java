package TA10;

public class kapalLaut7 extends Kendaraan7 {
    String nama;
    String jenis;

    @Override
    public void informasi() {
        System.out.println("Kapal Laut: " + nama + ", Jenis: " + jenis);
    }
}

