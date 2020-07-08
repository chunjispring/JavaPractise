package mypack;

import java.io.InputStream;
import java.util.Properties;

public class ShapeDrawer {
    public static final int RECTANGLE = 1;
    public static final int TRIANGLE = 2;
    public static final int LINE = 3;

    private static final Properties conf = new Properties();
    private static int shape = 1;
    private static char symbol = '*';

    static {
        try {
            InputStream in = ShapeDrawer.class.getResourceAsStream("configuration.txt");
            conf.load(in);
            shape = Integer.parseInt((String) conf.get("shape"));
            symbol = ((String) conf.get("symbol")).charAt(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void draw(int n) {
        switch (shape) {
            case RECTANGLE:
                drawRectangle(n);
                break;
            case TRIANGLE:
                drawTriangle(n);
                break;
            case LINE:
                drawLine(n);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }
    }

    private static void drawRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j > n - i && j < n + i) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
