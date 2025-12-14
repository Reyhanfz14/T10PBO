package TA10;

public class mobil7 extends Kendaraan7 {
    String nama;
    String jenis;

    @Override
    public void informasi() {
        System.out.println("Mobil: " + nama + ", Jenis: " + jenis);
    }
}

