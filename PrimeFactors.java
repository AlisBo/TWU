public class PrimeFactors {
    public static void main(String[] args) {
        Factors f = new Factors();
        int n = f.takeNumber();
        if (n == 1){
            System.out.println("");
        }
        else {
            int [] table = f.generate(n);
            for (int x=0; x<=n-1; x++) {
                if (table[x] != 0) {
                    System.out.print(table[x] + ", ");
                }
            }
            System.out.println("");
        }

    }
}