import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {

    public static int size;
    public static int [][] mat;

    public static void main(String[] args)
    {
        int sand;
        BMP bmp = new BMP();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter matrix length: ");
        size = scan.nextInt();

        System.out.println("Enter amount of sand to put in the middle: ");
        sand = scan.nextInt();

        Sandpile s = new Sandpile(size);
        ImageCreator imgCreator = new ImageCreator(size);
        s.addToCenter(sand);
        s.topple();
        imgCreator.drawImg(s.getPile(), size);
        bmp.saveBMP(System.getProperty("user.home") + "\\Desktop\\" + size +" pic.bmp", imgCreator.getRgbValues());
    }
}
