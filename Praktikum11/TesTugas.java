import tugas.*;
public class TesTugas {
    public static void main(String[] args){
        Dosen fahrul = new Dosen("fahrul","123456", "19990129");
        boolean result = fahrul.login("fahrul", "123456", "19990129");
        System.out.println(result ? "Login berhasil" : "Login gagal");

        Mahasiswa fadilah = new Mahasiswa(838535013, "123456");
        result = fadilah.login(838535013, "123456");
        System.out.println(result ? "Login berhasil" : "Login gagal");
    }
}
