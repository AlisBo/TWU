public class RightTriangle {
    public static void main(String[] args) {
        RtriangleBuilder l = new RtriangleBuilder();
        int side = l.takeNumber();
        l.build(side);

    }
}