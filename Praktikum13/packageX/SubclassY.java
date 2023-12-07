package packageX;
public class SubclassY extends SuperclassX{
    public static void main(String[] args) {
        SuperclassX objX = new SubclassY();
        SubclassY objY = new SubclassY();
        objY.superclassMethodX();
        System.out.println(objY.superclassVarX);
    }
}
