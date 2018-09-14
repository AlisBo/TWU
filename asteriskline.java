public class asteriskline {
    public static void main(String[] args) {
        Linebuilder l = new Linebuilder();
        int length = l.takeNumber();
        l.build(length);

    }
}