import java.util.ArrayList;
import java.util.List;

class Point {
    private double X;
    private double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public static double CalculateArea(List<Point> points) {
        int count = points.size();
        double area0 = 0;
        double area1 = 0;
        for (int i = 0; i < count; i++) {
            double x = points.get(i).X;
            double y = i + 1 < count ? points.get(i + 1).Y : points.get(0).Y;
            area0 += x * y;
            double lat = points.get(i).Y;
            double lon = i + 1 < count ? points.get(i + 1).X : points.get(0).X;
            area1 += lat * lon;
        }
        return Math.round(Math.abs(0.5 * (area0 - area1)));
    }

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        Point point1 = new Point(3, 4);
        Point point2 = new Point(5, 11);
        Point point3 = new Point(12, 8);
        Point point4 = new Point(9, 5);
        Point point5 = new Point(5, 6);
        points.add(point5);
        points.add(point4);
        points.add(point3);
        points.add(point2);
        points.add(point1);
        System.out.println(CalculateArea(points));
    }
}