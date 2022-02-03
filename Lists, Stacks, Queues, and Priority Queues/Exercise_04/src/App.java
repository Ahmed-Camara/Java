import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Point[] points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            double x = Math.random() * 100;
            double y = Math.random() * 100;
            points[i] = new Point(x, y);
        }

        Arrays.sort(points, new CompareY());
        for (Point p: points) {
            System.out.println("[" + p.getX() + ", " + p.getY() + "]");
        }
    }
}
