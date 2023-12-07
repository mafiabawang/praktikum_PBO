package latihan2;

class HankyPanky extends HumptyDumpty {

    @Override
    void myMethod() {
        System.out.println("Kelas Hanky Panky");
    }

    public static void main(String[] args) {
        HankyPanky hp = new HankyPanky();
        hp.myMethod();
    }
}
