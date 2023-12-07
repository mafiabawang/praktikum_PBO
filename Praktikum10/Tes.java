import tugas.*;
public class Tes {
    public static void main(String[] args) {
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("Kuning");
        truk1.setBahanBakar("solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);

        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("Merah");
        truk2.setBahanBakar("solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);

        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("Orange");
        taksi1.setBahanBakar("Bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);

        Taksi taksi2 = new Taksi();
        taksi2.setJmlRoda(4);
        taksi2.setWarna("Biru");
        taksi2.setBahanBakar("Bensin");
        taksi2.setKapasitasMesin(1500);
        taksi2.setTarifAwal(7000);
        taksi2.setTarifPerKm(3500);

        Sepeda sepeda1 = new Sepeda();
        sepeda1.setJmlRoda(3);
        sepeda1.setWarna("Hitam");
        sepeda1.setJmlSadel(1);
        sepeda1.setJmlGir(2);

        Sepeda sepeda2 = new Sepeda();
        sepeda2.setJmlRoda(2);
        sepeda2.setWarna("Putih");
        sepeda2.setJmlSadel(2);
        sepeda2.setJmlGir(5);

        System.out.println("| Obyek \t| jmlRoda \t| warna \t| bahanBakar \t| kapasitasMesin \t| muatanMaks \t|");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("| truk1 \t| %d \t\t| %s \t| %s \t| %d \t\t\t| %d \t\t| \n",truk1.getJmlRoda(), truk1.getWarna(), truk1.getBahanBakar(), truk1.getKapasitasMesin(), truk1.getMuatanMaks());
        System.out.printf("| truk2 \t| %d \t\t| %s \t| %s \t| %d \t\t\t| %d \t\t| \n",truk2.getJmlRoda(), truk2.getWarna(), truk2.getBahanBakar(), truk2.getKapasitasMesin(), truk2.getMuatanMaks());
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("| Obyek \t| jmlRoda \t| warna \t| bahanBakar \t| kapasitasMesin \t| tarifAwal \t| tarifPerKm \t|");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| taksi1 \t| %d \t\t| %s \t| %s \t| %d \t\t\t| %d \t| %d \t\t| \n",taksi1.getJmlRoda(), taksi1.getWarna(), taksi1.getBahanBakar(), taksi1.getKapasitasMesin(), taksi1.getTarifAwal(), taksi1.getTarifPerKm());
        System.out.printf("| taksi2 \t| %d \t\t| %s \t\t| %s \t| %d \t\t\t| %d \t\t| %d \t\t| \n",taksi2.getJmlRoda(), taksi2.getWarna(), taksi2.getBahanBakar(), taksi2.getKapasitasMesin(), taksi2.getTarifAwal(), taksi2.getTarifPerKm());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Obyek \t| jmlRoda \t| warna \t| jmlhSadel \t| jmlGir \t|");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("| sepeda1 \t| %d \t\t| %s \t| %d \t\t| %d \t\t| \n",sepeda1.getJmlRoda(), sepeda1.getWarna(), sepeda1.getJmlSadel(), sepeda1.getJmlGir());
        System.out.printf("| sepeda1 \t| %d \t\t| %s \t| %d \t\t| %d \t\t| \n",sepeda2.getJmlRoda(), sepeda2.getWarna(), sepeda2.getJmlSadel(), sepeda2.getJmlGir());
        System.out.println("---------------------------------------------------------------------------------");
    }
}