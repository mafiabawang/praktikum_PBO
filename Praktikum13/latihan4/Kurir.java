package latihan4;
public class Kurir extends Pegawai{
    private String wilayah;

    public Kurir(String nama, double gaji, String wilayah) {
        super(nama, gaji);
        this.wilayah = wilayah;
    }

    public void info() {
        super.info();
        System.out.println("Wilayah: " + wilayah);
    }

    public void antarPaket() {
        System.out.println("Kurir sedang mengantar paket.");
    }
}
