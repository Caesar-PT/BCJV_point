public class MainTess {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 5);
        System.out.println(point2D.toString());

        point2D.setXY(5.0f, 9.7f);
        System.out.println(point2D.toString());
        point2D.setX(6);
        point2D.setY(7);
        System.out.println(point2D.toString());

        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D.toString());
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D.toString());
        point3D.setZ(10);
        System.out.println(point3D.toString());
    }
}
