package ex44;

public class Main44 {
    public static void main(String[] args) {

        System.out.println("--- KIỂM TRA LỚP POINT ---");
        // Tạo một đối tượng Point bằng constructor 2 tham số
        Point p1 = new Point(3.0f, 4.0f);
        System.out.println("p1 (constructor): " + p1); // Sẽ gọi p1.toString()

        // Test các hàm set
        p1.setX(5.5f);
        p1.setY(6.6f);
        System.out.println("p1 (sau khi setX, setY): " + p1);

        // Test các hàm get
        System.out.println("p1.getX() = " + p1.getX());
        System.out.println("p1.getY() = " + p1.getY());

        // Test setXY và getXY
        p1.setXY(10.0f, 11.0f);
        float[] xy = p1.getXY();
        System.out.println("p1 (sau khi setXY): " + p1);
        System.out.println("p1.getXY() = [" + xy[0] + ", " + xy[1] + "]");

        System.out.println("\n--- KIỂM TRA LỚP MOVABLEPOINT ---");
        // Tạo một đối tượng MovablePoint bằng constructor 4 tham số
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("mp1 (constructor): " + mp1); // Sẽ gọi mp1.toString()

        // Test các hàm set speed
        mp1.setXSpeed(1.0f);
        mp1.setYSpeed(1.0f);
        System.out.println("mp1 (sau khi set speed): " + mp1);

        // Test hàm move()
        System.out.println("Bắt đầu di chuyển mp1...");
        mp1.move();
        System.out.println("mp1 (sau 1 lần move): " + mp1); // (1.0 + 1.0, 2.0 + 1.0) = (2.0, 3.0)

        mp1.move();
        System.out.println("mp1 (sau 2 lần move): " + mp1); // (2.0 + 1.0, 3.0 + 1.0) = (3.0, 4.0)

        // Test hàm move() trả về 'this' (gọi chuỗi)
        System.out.println("mp1 (gọi move().move()): " + mp1.move().move()); // (5.0, 6.0)
    }
}
