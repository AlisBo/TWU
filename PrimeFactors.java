public class PrimeFactors {
    public static void main(String[] args) {
        Factors f = new Factors();
        int n = f.takeNumber();
        int [] table = f.factorise(n);
        for (int x=0; x<=n-1; x++) {
            if (table[x] != 0) {
                System.out.print(table[x] + ", ");
            }
        }
    }
}