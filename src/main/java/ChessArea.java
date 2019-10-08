import java.util.Scanner;

public class ChessArea {

    int height;
    int width;

    static Scanner scanner = new Scanner(System.in);

    public ChessArea(int height, int width) {
        this.height = Integer.valueOf(height);
        this.width = Integer.valueOf(width);
        if (height <= 0 || width <= 0) throw new IllegalArgumentException();
    }

    public static int getInt() {
        int num;
        System.out.println("Input number:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Your must input number > 0");
                scanner.next();
                num = getInt();
            }
        } else {
            System.out.println("Your input number is incorrect, try again!");
            scanner.next();//recursion
            num = getInt();
        }
        return num;
    }

    public static void outputChessArea(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
