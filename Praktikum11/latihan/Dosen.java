package latihan;
public class Dosen extends User {
    private String pangkat, golongan, key;
    public Dosen(){}
    public Dosen(String username, String password){ super(username, password); }

    public void setPangkat(String x){ this.pangkat = x; }
    public String getPangkat(){ return pangkat; }

    public void setGolongan(String x){ this.golongan = x; }
    public String getGolongan(){ return golongan; }

    public void setKey(String x){ this.key = x; }
    public String getKey(){ return key; }

    public boolean login(String username, String password){ return super.login(username, password); }
    public boolean login(String username, String password, String key) { return super.login(username, password) && this.key == key; }
    public boolean login(int phone, String password){ return super.login(phone, password); }
    public boolean login(int phone, String password, String key){ return super.login(phone, key) && this.key == key; }
}
