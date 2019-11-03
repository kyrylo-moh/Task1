package model;

public class ChessArea {

    private int height;
    private int width;

    public ChessArea(int height, int width) {
        this.height = height;
        this.width = width;
        if (height <= 0 || width <= 0) throw new IllegalArgumentException();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
