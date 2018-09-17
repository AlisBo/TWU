import java.util.Scanner;

class Factors {
    int takeNumber() {
        // take input
        System.out.println("Input a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

     int [] factorise(int n) {
        int [] factors = new int[n];
        System.out.print("Prime factors of " + n + ": \n");
        if (n==1) {
            return null;
        }
        else {
            int i = 2;
            int j = 0;
            int limit = (int)(n/2);
            while (i <= limit) {
                while ((n % i) == 0) {
                    n /= i;
                    limit = (int)(Math.sqrt(n));
                    factors[j] = i;
                    j++;
                }
                i++;
            }
            if (n > 1) factors[j] = n;
        }
        return factors;
     }

}