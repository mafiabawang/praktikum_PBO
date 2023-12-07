package tugas;
public class Taksi extends Mobil {
    protected int tarifAwal, tarifPerKm;

    public void setTarifAwal(int x){ tarifAwal = x; }

    public int getTarifAwal(){ return tarifAwal; }

    public void setTarifPerKm(int i){ tarifPerKm = i; }

    public int getTarifPerKm(){ return tarifPerKm; }
}