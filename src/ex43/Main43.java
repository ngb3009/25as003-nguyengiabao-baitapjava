package ex43;

public class Main43 {
    public static void main(String[] args) {

        // --- Kiểm tra Point2D ---
        System.out.println("--- Testing Point2D ---");

        // Tạo đối tượng Point2D bằng constructor mặc định
        Point2D p2d_1 = new Point2D();
        System.out.println("Point2D (default): " + p2d_1.toString()); // Output: (0.0,0.0)

        // Thay đổi giá trị
        p2d_1.setX(1.1f);
        p2d_1.setY(2.2f);
        System.out.println("Point2D (sau khi set): " + p2d_1); // toString() được gọi ngầm

        // Lấy mảng XY
        float[] xy = p2d_1.getXY();
        System.out.println("getXY(): [" + xy[0] + ", " + xy[1] + "]");

        // Tạo đối tượng Point2D bằng constructor có tham số
        Point2D p2d_2 = new Point2D(3.3f, 4.4f);
        System.out.println("Point2D (param): " + p2d_2); // Output: (3.3,4.4)

        // --- Kiểm tra Point3D ---
        System.out.println("\n--- Testing Point3D ---");

        // Tạo đối tượng Point3D bằng constructor mặc định
        Point3D p3d_1 = new Point3D();
        System.out.println("Point3D (default): " + p3d_1); // Output: (0.0,0.0,0.0)

        // Thay đổi giá trị (dùng cả phương thức của cha và con)
        p3d_1.setX(5.1f); // Kế thừa từ Point2D
        p3d_1.setY(6.2f); // Kế thừa từ Point2D
        p3d_1.setZ(7.3f); // Của riêng Point3D
        System.out.println("Point3D (sau khi set): " + p3d_1); // Output: (5.1,6.2,7.3)

        // Dùng setXYZ
        p3d_1.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D (sau khi setXYZ): " + p3d_1); // Output: (1.0,2.0,3.0)

        // Lấy mảng XYZ
        float[] xyz = p3d_1.getXYZ();
        System.out.println("getXYZ(): [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");

        // Tạo đối tượng Point3D bằng constructor có tham số
        Point3D p3d_2 = new Point3D(8.8f, 9.9f, 10.1f);
        System.out.println("Point3D (param): " + p3d_2); // Output: (8.8,9.9,10.1)
    }
}
