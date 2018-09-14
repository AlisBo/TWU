public class DiamondName {
    public static void main(String[] args) {
        NdiamondBuilder d = new NdiamondBuilder();
        int side = d.takeNumber();
        d.build(side);

    }
}