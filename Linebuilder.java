import java.util.Scanner;

class Linebuilder {
    void build(int length){
        System.out.println("Here you go!");
        while(length > 0){
            System.out.print("*");
            length = length - 1;
        }
        System.out.println("");
    }

    int takeNumber(){
        System.out.println("How long do you want your line?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}

