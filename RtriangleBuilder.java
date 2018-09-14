import java.util.Scanner;

class RtriangleBuilder {
    void build(int side){
        System.out.println("Here you go!");
        int counter = 1;
        while(counter <= side){
            for(int x = 1; x <= counter; x++){
                System.out.print("*");
            }
            System.out.println("");
            counter = counter + 1;
        }

    }

    int takeNumber(){
        System.out.println("What size triangle would you like?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}

