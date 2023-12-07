package perbankan;
public class PengambilanUang extends Tabungan {
    private int proteksi;
    public PengambilanUang(int saldo) { super(saldo); }
    public PengambilanUang(int saldo, int proteksi) { 
        super(saldo);
        this.proteksi = proteksi;
    }
    public int getSaldo(){ return saldo; }
    public boolean ambilUang(int jumlah) { return jumlah <= saldo - proteksi; }
}