package latihan;
public class User {
    private int phone;
    private String username, password;

    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String x){ this.username = x; }
    public void setPassword(String x){ this.password = x; }
    public void setPhone(int x) { this.phone = x; }

    public boolean login(String username, String password){ return this.username == username && this.password == password; }
    public boolean login(int phone, String password){ return this.phone == phone && this.password == password; } 
}