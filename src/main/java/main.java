
public class main {
    public static void main(String[] args) {
        int height = ChessArea.getInt();
        int width = ChessArea.getInt();
        try {
            ChessArea chsArea = new ChessArea(height, width);
            chsArea.outputChessArea(chsArea.height, chsArea.width);
        } catch (IllegalArgumentException e) {
            System.out.println("Your param must be bigger than 0");
        }
    }
}
