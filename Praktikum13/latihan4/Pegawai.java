package latihan4;
public class Pegawai {
    private String nama;
    private double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void info() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji Pegawai: Rp." + gaji);
    }
}
