package Controller;

import Util.*;
import Model.ChessArea;
import Service.Service;

public class ChessController {

    public ChessController() { }

    private static ChessArea chessArea;
    private static Output output;

    public static void Run() {
        output = new Output();
        int height = Input.getInt();
        int width = Input.getInt();
        try {
            chessArea = new ChessArea(height, width);
            Service.printChessArea(chessArea.getHeight(), chessArea.getWidth());
        } catch (IllegalArgumentException e) {
            output.getMessage("Your param must be bigger than 0");
        }
    }
}
