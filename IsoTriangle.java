public class IsoTriangle {
    public static void main(String[] args) {
        ItriangBuilder t = new ItriangBuilder();
        int side = t.takeNumber();
        t.build(side);

    }
}