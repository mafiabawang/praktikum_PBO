package percobaan;
public class Fans {
    private String name;
    public Fans(){ this.name = "noname"; }
    public Fans(String name){ this.name = name; }
    public void showName(){ System.out.print("\n" + this.name + ": "); }
    public void watchingPerformances(){
        this.showName();
        System.out.print("melihat idolanya dari youtube");
    }

    public void watchingPerformances(Musician musician){
        this.showName();
        System.out.print("melihat idolanya");
        musician.perform();
    }
}