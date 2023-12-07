package tugas2;
public class TesTugas2 {
    public static void main(String[] args) {
        Katak O1 = new Katak(5, "Froggy");
        Kecebong O2 = new Kecebong(2,"Junior Frog", 10);

        System.out.println("| Obyek \t| Umur \t| Nama \t\t| PanjangEkor \t| CaraBergerak \t|");
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("| O1 \t\t| %d \t| %s \t| - \t\t| %s \t|\n", O1.umur, O1.nama, O1.caraBergerak());
        System.out.printf("| O2 \t\t| %d \t| %s \t| %.0f \t\t| %s \t|\n", O2.umur, O2.nama, O2.panjangEkor, O2.caraBergerak());
        System.out.println("-------------------------------------------------------------------------");
    }
}
