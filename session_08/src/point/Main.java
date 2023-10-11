package point;

public class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D(1,2,3);
        System.out.println(point);

        point.setXYZ(2,5,7);
        System.out.println(point);

        System.out.println(point instanceof Point2D);
    }

}
