public class Diamond {
    public static void main(String[] args) {
        DiamondBuilder t = new DiamondBuilder();
        int side = t.takeNumber();
        t.build(side);

    }
}