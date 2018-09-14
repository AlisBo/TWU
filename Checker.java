class Checker{
    boolean isThree(int n) {
        if (n%3 == 0) {
            return true;
        }

        else{
            return false;
        }

    }

    boolean isFive(int n) {
        if (n%5 == 0) {
            return true;
        }

        else{
            return false;
        }

    }

    boolean isBoth(int n) {
        if (n%3 == 0 && n%5 ==0) {
            return true;
        }

        else{
            return false;
        }

    }

}