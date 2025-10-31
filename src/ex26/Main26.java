package ex26;

import java.util.Arrays; // Cần thiết để in mảng một cách đẹp mắt

/**
 * Lớp Test Driver để kiểm tra các phương thức của MyPoint.
 */
public class Main26 {
    public static void main(String[] args) {
        // 1. Kiểm tra constructors và toString()
        System.out.println("--- Kiểm tra Constructors và toString() ---");
        MyPoint p1 = new MyPoint(); // Constructor mặc định
        System.out.println("p1 (mặc định): " + p1); // Mong đợi: (0,0)

        MyPoint p2 = new MyPoint(3, 4); // Constructor có tham số
        System.out.println("p2 (có tham số): " + p2); // Mong đợi: (3,4)

        // 2. Kiểm tra getters và setters
        System.out.println("\n--- Kiểm tra Getters và Setters ---");
        p1.setX(5);
        p1.setY(6);
        System.out.println("p1 sau khi setX(5), setY(6): " + p1); // Mong đợi: (5,6)
        System.out.println("p1.getX(): " + p1.getX()); // Mong đợi: 5
        System.out.println("p1.getY(): " + p1.getY()); // Mong đợi: 6

        p1.setXY(10, 11);
        System.out.println("p1 sau khi setXY(10, 11): " + p1); // Mong đợi: (10,11)

        // Kiểm tra getXY()
        int[] coords = p1.getXY();
        System.out.println("p1.getXY(): " + Arrays.toString(coords)); // Mong đợi: [10, 11]

        // 3. Kiểm tra các phương thức distance()
        System.out.println("\n--- Kiểm tra các phương thức distance() ---");
        System.out.println("p2 đang ở vị trí: " + p2); // (3,4)

        // Test distance() - Khoảng cách tới (0,0)
        // sqrt(3^2 + 4^2) = sqrt(9 + 16) = sqrt(25) = 5
        System.out.printf("Khoảng cách từ p2 đến (0,0): %.2f\n", p2.distance()); // Mong đợi: 5.00

        // Test distance(int, int)
        System.out.printf("Khoảng cách từ p2 đến (0,0): %.2f\n", p2.distance(0, 0)); // Mong đợi: 5.00

        // Khoảng cách từ (3,4) đến (6,8)
        // sqrt((6-3)^2 + (8-4)^2) = sqrt(3^2 + 4^2) = 5
        System.out.printf("Khoảng cách từ p2 đến (6,8): %.2f\n", p2.distance(6, 8)); // Mong đợi: 5.00

        // Test distance(MyPoint)
        MyPoint p3 = new MyPoint(6, 8);
        System.out.println("Tạo p3 tại: " + p3);
        System.out.printf("Khoảng cách từ p2 đến p3: %.2f\n", p2.distance(p3)); // Mong đợi: 5.00
    }
}