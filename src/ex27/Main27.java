package ex27;

import java.util.Arrays; // Cần để in mảng

/**
 * Lớp Test Driver để kiểm tra các phương thức của MyLine.
 */
public class Main27 {
    public static void main(String[] args) {
        // 1. Kiểm tra constructor (x1, y1, x2, y2) và toString()
        System.out.println("--- Kiểm tra Constructor 1 và toString() ---");
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 1: " + line1); // Mong đợi: MyLine[begin=(0,0),end=(3,4)]

        // 2. Kiểm tra constructor (MyPoint, MyPoint)
        System.out.println("\n--- Kiểm tra Constructor 2 ---");
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(5, 4);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2); // Mong đợi: MyLine[begin=(1,1),end=(5,4)]

        // 3. Kiểm tra Getters và Setters
        System.out.println("\n--- Kiểm tra Getters và Setters ---");

        // getBegin/getEnd
        System.out.println("Điểm bắt đầu line 1: " + line1.getBegin()); // (0,0)
        System.out.println("Điểm kết thúc line 1: " + line1.getEnd()); // (3,4)

        // setBegin/setEnd
        line1.setBegin(new MyPoint(2, 2));
        line1.setEnd(new MyPoint(5, 6));
        System.out.println("Line 1 sau khi set: " + line1); // MyLine[begin=(2,2),end=(5,6)]

        // get/set cho từng tọa độ
        System.out.println("Line 2 getBeginX: " + line2.getBeginX()); // 1
        System.out.println("Line 2 getEndY: " + line2.getEndY()); // 4

        line2.setBeginX(0);
        line2.setEndY(0);
        System.out.println("Line 2 sau khi setBeginX(0), setEndY(0): " + line2); // MyLine[begin=(0,1),end=(5,0)]

        // get/set XY
        line2.setBeginXY(10, 10);
        line2.setEndXY(20, 20);
        System.out.println("Line 2 sau khi setXY: " + line2); // MyLine[begin=(10,10),end=(20,20)]
        System.out.println("Line 2 getBeginXY: " + Arrays.toString(line2.getBeginXY())); // [10, 10]

        // 4. Kiểm tra getLength() và getGradient()
        System.out.println("\n--- Kiểm tra getLength() và getGradient() ---");
        MyLine line3 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 3: " + line3);

        // getLength(): sqrt((3-0)^2 + (4-0)^2) = sqrt(9 + 16) = sqrt(25) = 5
        System.out.printf("Độ dài Line 3: %.2f\n", line3.getLength()); // 5.00

        // getGradient()
        double gradient = line3.getGradient();
        System.out.println("Độ dốc Line 3 (radians): " + gradient);
        System.out.printf("Độ dốc Line 3 (degrees): %.2f\n", Math.toDegrees(gradient)); // ~ 53.13 độ

        MyLine line4 = new MyLine(0, 0, 5, 0); // Đường ngang
        System.out.println("Line 4 (ngang): " + line4);
        System.out.println("Độ dốc Line 4 (radians): " + line4.getGradient()); // 0.0
    }
}