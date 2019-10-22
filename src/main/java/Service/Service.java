package Service;

public class Service {

    public static void printChessArea(int height, int width) {
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
