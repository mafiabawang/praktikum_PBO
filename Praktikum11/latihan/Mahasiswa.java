package latihan;
public class Mahasiswa extends User {
    private Dosen dosenwali;
    private String kelas;
    public Mahasiswa(){}
    public Mahasiswa(String username, String password){ super(username,password); }
    
    public void setKelas(String x){ this.kelas = x; }
    public String getKelas(){ return kelas; }

    public void setDosen(Dosen dosenwali){ this.dosenwali = dosenwali; }
    public Dosen getDosen(){return dosenwali; }
}
