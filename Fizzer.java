class Fizzer {
    Checker c = new Checker();

    void whatAmI(int n) {
        if (c.isBoth(n)) {
            System.out.println("FizzBuzz");
        }
        else if (c.isThree(n)) {
            System.out.println("Fizz");
        }
        else if (c.isFive(n)) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(n);
        }
    }

}