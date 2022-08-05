package service;

public class Service {

    private StringBuilder stringBuilder = new StringBuilder();

    public String printChessArea(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) {
                    stringBuilder.append('*');
                } else {
                    stringBuilder.append(' ');
                }
            }
                stringBuilder.append('\n');
            }
            return stringBuilder.toString();
    }

    public void clearStringBuilder() {
        stringBuilder.setLength(0);
    }

}

