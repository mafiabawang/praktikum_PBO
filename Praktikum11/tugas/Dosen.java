package tugas;
public class Dosen extends User {
    private String key;
    public Dosen(String username, String password, String key){
        super(username, password);
        this.key = key;
    }

    public boolean login(String username, String password, String key) { return super.login(username, password) && this.key == key; }
}
