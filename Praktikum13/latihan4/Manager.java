package latihan4;
public class Manager extends Pegawai {
    private String departemen;

    public Manager(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    public void info() {
        super.info();
        System.out.println("Departemen: " + departemen);
    }

    public void meeting() {
        System.out.println("Manajer sedang dalam rapat.");
    }
}
