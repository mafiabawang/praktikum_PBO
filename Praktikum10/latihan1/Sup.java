package latihan1;

public class Sup extends Base{
    public static void main(String argv[]){
        Sup s= new Sup();
        s.derived();
    }

    public Sup(){
        super(1927);
    }

    public void derived(){
        System.out.println("sup derived");
    }
}
