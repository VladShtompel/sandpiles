public class ImageCreator {

    private int[][] rgbValues;

    public ImageCreator(int size)
    {
        rgbValues = new int[size][size];
    }

    public int[] num2RGB(int n)
    {
        int [] rgb = new int[3];
        if(n == 0) { rgb[0] = 51; rgb[1] = 230; rgb[2] = 144; }
        if(n == 1) { rgb[0] = 128; rgb[1] = 77; rgb[2] = 167; }
        if(n == 2) { rgb[0] = 0; rgb[1] = 255; rgb[2] = 150; }
        if(n == 3) { rgb[0] = 122; rgb[1] = 246; rgb[2] = 218; }
        return rgb;
    }

    public void drawImg(int[][] mat, int size) {
        int [] rgb = new int[3];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
            {
                rgb = num2RGB(mat[i][j]);
                rgbValues[i][j] = rgb[0] | (rgb[1] << 8) | (rgb[2] << 16); // draw only
            }
    }

    public int[][] getRgbValues() { return rgbValues; }
}
