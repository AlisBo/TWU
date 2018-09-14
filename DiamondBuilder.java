import java.util.Scanner;

class DiamondBuilder {
    void build(int side){
        System.out.println("Here you go!");
        int counter = 1;                    // layer number
        while(counter <= side-1){
            int space = side - counter;    //number of spaces on each side ot the triangle layer
            for(int x = 1; x <= space; x++){
                System.out.print(" ");
            }
            int ast = 2*(counter - 1) + 1;  //number of asterisks in this layer
            for(int x = 1; x <= ast; x++){
                System.out.print("*");
            }
            for(int x = 1; x <= space; x++){
                System.out.print(" ");
            }
            System.out.println("");
            counter = counter + 1;

        }

        for(int x=1; x == side; x++){   //Middle line
            System.out.print("*");
        }

        while(counter > 0){
            int space = side - counter;    //number of spaces on each side ot the triangle layer
            for(int x = 1; x <= space; x++){
                System.out.print(" ");
            }
            int ast = 2*(counter - 1) + 1;  //number of asterisks in this layer
            for(int x = 1; x <= ast; x++){
                System.out.print("*");
            }
            for(int x = 1; x <= space; x++){
                System.out.print(" ");
            }
            System.out.println("");
            counter = counter - 1;

        }


    }

    int takeNumber(){
        System.out.println("What size diamond would you like?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

}

