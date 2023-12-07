package tugas;
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public void setBahanBakar(String x){ bahanBakar = x; }

    public String getBahanBakar(){ return bahanBakar; }

    public void setKapasitasMesin(int i){ kapasitasMesin = i; }

    public int getKapasitasMesin(){ return kapasitasMesin; }
}