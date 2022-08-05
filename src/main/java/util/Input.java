package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner = new Scanner(System.in);
    private Output output;
    private Validator validator;

    public int getInt() {
        output = new Output();
        validator = new Validator();
        int num;
        output.getMessage("Input number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (validator.isNegativeNumber(num)) {
                output.getMessage("Your must input number > 0");
                scanner.next();
                num = getInt();
            }
        } else {
            output.getMessage("Your input number is incorrect, try again!");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
