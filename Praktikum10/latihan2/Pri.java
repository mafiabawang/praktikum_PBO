package latihan2;

public class Pri extends Base {
    static int i = 200;
    
    Pri() {
        super();
    }

    public void cetak(){
        System.out.println(i);
    }

    public static void main(String argv[]){
        Pri p = new Pri();
        p.cetak();
    }
}