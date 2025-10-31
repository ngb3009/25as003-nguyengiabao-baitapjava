package ex28;

import java.util.Arrays; // Cần để in mảng

/**
 * Lớp Test Driver để kiểm tra các phương thức của MyCircle.
 */
public class Main28 {
    public static void main(String[] args) {
        // 1. Kiểm tra các constructor và toString()
        System.out.println("--- Kiểm tra Constructors và toString() ---");
        MyCircle c1 = new MyCircle();
        System.out.println("c1 (mặc định): " + c1); // Mong đợi: MyCircle[radius=1, center=(0,0)]

        MyCircle c2 = new MyCircle(3, 4, 5);
        System.out.println("c2 (x,y,r): " + c2); // Mong đợi: MyCircle[radius=5, center=(3,4)]

        MyPoint p3 = new MyPoint(5, 6);
        MyCircle c3 = new MyCircle(p3, 7);
        System.out.println("c3 (MyPoint,r): " + c3); // Mong đợi: MyCircle[radius=7, center=(5,6)]

        // 2. Kiểm tra Getters và Setters
        System.out.println("\n--- Kiểm tra Getters và Setters ---");
        c1.setRadius(10);
        c1.setCenter(new MyPoint(1, 2));
        System.out.println("c1 sau khi set: " + c1);
        System.out.println("c1 getRadius: " + c1.getRadius()); // 10
        System.out.println("c1 getCenter: " + c1.getCenter()); // (1,2)

        // 3. Kiểm tra các phương thức proxy (ủy quyền)
        System.out.println("\n--- Kiểm tra các phương thức Proxy ---");
        System.out.println("c2 getCenterX: " + c2.getCenterX()); // 3
        System.out.println("c2 getCenterY: " + c2.getCenterY()); // 4
        c2.setCenterY(9);
        c2.setCenterXY(8, 8);
        System.out.println("c2 sau khi setCenterY(9) và setCenterXY(8,8): " + c2); // (8,8)
        System.out.println("c2 getCenterXY: " + Arrays.toString(c2.getCenterXY())); // [8, 8]

        // 4. Kiểm tra các phương thức tính toán
        System.out.println("\n--- Kiểm tra các phương thức tính toán ---");
        System.out.println("c2 (radius=5): " + c2);
        // Area = PI * 5^2 = ~78.54
        System.out.printf("c2 Diện tích: %.2f\n", c2.getArea());
        // Circumference = 2 * PI * 5 = ~31.42
        System.out.printf("c2 Chu vi: %.2f\n", c2.getCircumference());

        // 5. Kiểm tra phương thức distance()
        System.out.println("\n--- Kiểm tra distance() ---");
        System.out.println("c2 (tâm tại (8,8)): " + c2);
        System.out.println("c3 (tâm tại (5,6)): " + c3);
        // Khoảng cách giữa (8,8) và (5,6)
        // sqrt((8-5)^2 + (8-6)^2) = sqrt(3^2 + 2^2) = sqrt(9 + 4) = sqrt(13) ~ 3.61
        System.out.printf("Khoảng cách c2 và c3: %.2f\n", c2.distance(c3));
    }
}