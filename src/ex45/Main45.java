package ex45;

public class Main45 {
    public static void main(String[] args) {

        System.out.println("--- Kiểm tra lớp Circle ---");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Diện tích: " + c1.getArea());
        System.out.println("Chu vi: " + c1.getPerimeter());

        Circle c2 = new Circle(5.0, "blue", false);
        System.out.println(c2);
        c2.setRadius(7.0);
        System.out.println("Bán kính mới: " + c2.getRadius());
        System.out.println("Thông tin mới: " + c2);

        System.out.println("\n--- Kiểm tra lớp Rectangle ---");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Diện tích: " + r1.getArea());
        System.out.println("Chu vi: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(3.0, 5.0, "green", true);
        System.out.println(r2);
        r2.setLength(6.0);
        System.out.println("Thông tin mới: " + r2);

        System.out.println("\n--- Kiểm tra lớp Square ---");
        Square sq1 = new Square();
        System.out.println(sq1);
        System.out.println("Diện tích: " + sq1.getArea());
        System.out.println("Chu vi: " + sq1.getPerimeter());

        Square sq2 = new Square(4.0, "yellow", false);
        System.out.println(sq2);

        // Kiểm tra tính chất đặc biệt của hình vuông
        System.out.println("Đặt setWidth(5.0)...");
        sq2.setWidth(5.0);
        System.out.println(sq2); // Cả width và length đều phải là 5.0
        System.out.println("Cạnh: " + sq2.getSide());

        System.out.println("Đặt setLength(6.0)...");
        sq2.setLength(6.0);
        System.out.println(sq2); // Cả width và length đều phải là 6.0
        System.out.println("Cạnh: " + sq2.getSide());

        System.out.println("Đặt setSide(10.0)...");
        sq2.setSide(10.0);
        System.out.println(sq2); // Cả width và length đều phải là 10.0

        System.out.println("\n--- Kiểm tra tính đa hình (Polymorphism) ---");
        Shape s1 = new Circle(2.0, "orange", true);
        Shape s2 = new Rectangle(2.0, 4.0, "purple", false);
        Shape s3 = new Square(3.0, "black", true);

        System.out.println(s1); // Tự động gọi toString() của Circle
        System.out.println(s2); // Tự động gọi toString() của Rectangle
        System.out.println(s3); // Tự động gọi toString() của Square
    }
}