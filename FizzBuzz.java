import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("How many FizzBuzz numbers do you want?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fizzer f = new Fizzer();
        for (int x=1; x <=n; x++) {
            f.whatAmI(x);
        }

    }
}