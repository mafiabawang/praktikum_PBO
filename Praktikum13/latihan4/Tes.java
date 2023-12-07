package latihan4;
public class Tes {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Manager("Keboacid", 5000000, "IT");
        Pegawai pegawai2 = new Kurir("Kambingacid", 2500000, "Kota A");

        printInfo(pegawai1);
        printInfo(pegawai2);
    }

    public static void printInfo(Pegawai pegawai) {
        pegawai.info();
        if (pegawai instanceof Manager) {
            ((Manager) pegawai).meeting(); // Memanggil metode khusus Manajer
        } else if (pegawai instanceof Kurir) {
            ((Kurir) pegawai).antarPaket(); // Memanggil metode khusus Kurir
        }
        System.out.println();
    }
}
