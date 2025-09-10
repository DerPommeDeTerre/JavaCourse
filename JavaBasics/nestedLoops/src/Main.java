import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ----------Matrix of a symbol E.G.------------
        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
                Thread.sleep(1000);
            }
            System.out.println();
            Thread.sleep(1000);
        }

        scanner.close();
//        nested loop = A loop inside another loop
//                      Used often with matrices or DS&A
//        for(int i = 1; i <= 3; i++){
//            for (int j = 1; j <= 9 ; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

    }
}
