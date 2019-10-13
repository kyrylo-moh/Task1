import java.util.Scanner;

class Input {

    private static Output output;

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        output = new Output();
        int num;
        output.getMessage("Input number:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (num <= 0) {
                output.getMessage("Your must input number > 0");
                scanner.next();
                num = getInt();
            }
        } else {
            output.getMessage("Your input number is incorrect, try again!");
            scanner.next();//recursion
            num = getInt();
        }
        return num;
    }

}
