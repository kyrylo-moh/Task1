public class ChessController {

    public ChessController() { }

    private static ChessArea chessArea;
    private static Output output;

    static void Run() {
        output = new Output();
        int height = Input.getInt();
        int width = Input.getInt();
        try {
            chessArea = new ChessArea(height, width);
            output.printChessArea(chessArea.getHeight(), chessArea.getHeight());
        } catch (IllegalArgumentException e) {
            output.getMessage("Your param must be bigger than 0");
        }
    }
}
