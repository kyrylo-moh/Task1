package controller;

import util.*;
import model.ChessArea;
import service.Service;

public class ChessController {

    public ChessController() { }

    private ChessArea chessArea;
    private Output output = new Output();
    private Input input = new Input();
    private Service service = new Service();

    public ChessArea setChessArea() {
        int height = input.getInt();
        int width = input.getInt();
        chessArea = new ChessArea(height, width);
        return chessArea;
    }

    public void Run() {
        String answer;
        do {
            try {
                chessArea = setChessArea();
                output.getMessage(service.printChessArea(chessArea.getHeight(), chessArea.getWidth()));
                service.clearStringBuilder();
            } catch (IllegalArgumentException e) {
                output.getMessage("Your param must be bigger than 0");
            }
            output.getMessage("Do you want to continue?\t y/n");
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
            answer.equalsIgnoreCase("yes"));

    }
}
