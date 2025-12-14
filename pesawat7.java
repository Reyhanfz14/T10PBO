package TA10;

public class pesawat7 extends Kendaraan7 {
    String nama;
    String jenis;

    @Override
    public void informasi() {
        System.out.println("Pesawat: " + nama + ", Jenis: " + jenis);
    }
}

