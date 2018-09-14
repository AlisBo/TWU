import java.util.Scanner;

class Columnbuilder {
    void build(int height){
        System.out.println("Here you go!");
        while(height > 0){
            System.out.println("*");
            height = height - 1;
        }
        System.out.println("");
    }

    int takeNumber(){
        System.out.println("How tall do you want your column?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}

