package tugas;
public class User {
    private int phone;
    private String username, password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(int phone, String password){
        this.phone = phone;
        this.password = password;
    }

    public boolean login(String username, String password){return this.username == username && this.password == password; }
    public boolean login(int phone, String password){ return this.phone == phone && this.password == password; }
}
