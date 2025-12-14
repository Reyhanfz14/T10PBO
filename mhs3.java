package TA10;

public class mhs3 extends org3 {
        private String npm;

    public mhs3(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.npm = npm;
    }

    @Override
    public String info() {
        System.out.println("NPM : " + npm);
            return null;
    }

    
}
