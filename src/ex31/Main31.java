package ex31;

public class Main31 {
    public static void main(String[] args) {

        // --- 1. Khởi tạo các đối tượng MyComplex ---
        MyComplex c1 = new MyComplex(3.0, 4.0); // c1 = 3.0 + 4.0i
        MyComplex c2 = new MyComplex(1.0, -2.0); // c2 = 1.0 - 2.0i
        MyComplex c3 = new MyComplex(3.0, 4.0); // c3 = 3.0 + 4.0i (giống c1)
        MyComplex c4 = new MyComplex(5.0, 0.0); // c4 là một số thực

        System.out.println("--- Kiểm tra khởi tạo và toString() ---");
        System.out.println("c1: " + c1.toString()); // Sử dụng toString() ngầm định
        System.out.println("c2: " + c2);
        System.out.println("c4: " + c4);

        System.out.println("\n--- Kiểm tra isReal() và isImaginary() ---");
        System.out.println("c1 có phải số thực? " + c1.isReal());       // false
        System.out.println("c4 có phải số thực? " + c4.isReal());       // true
        System.out.println("c1 có phải số ảo? " + c1.isImaginary());   // false
        // (Nếu muốn kiểm tra số ảo thuần tuý, bạn có thể tạo new MyComplex(0, 5))

        System.out.println("\n--- Kiểm tra equals() ---");
        System.out.println("c1 bằng (3.0, 4.0)? " + c1.equals(3.0, 4.0)); // true
        System.out.println("c1 bằng c2? " + c1.equals(c2));             // false
        System.out.println("c1 bằng c3? " + c1.equals(c3));             // true

        System.out.println("\n--- Kiểm tra magnitude() và argument() ---");
        // c1 = 3 + 4i => magnitude = sqrt(3^2 + 4^2) = 5
        System.out.println("Độ lớn (magnitude) của c1: " + c1.magnitude());
        // argument = atan2(4, 3)
        System.out.println("Argument của c1 (radians): " + c1.argument());

        System.out.println("\n--- Kiểm tra các phép cộng (add, addNew, addInto) ---");

        // 1. add() - Trả về instance MỚI, c1 không đổi
        MyComplex sumAdd = c1.add(c2); // (3+1) + (4-2)i = 4.0 + 2.0i
        System.out.println("c1.add(c2) = " + sumAdd);
        System.out.println("Sau khi gọi add(), c1 = " + c1); // c1 vẫn là 3.0 + 4.0i

        // 2. addNew() - Giống hệt add()
        MyComplex sumAddNew = c1.addNew(c2);
        System.out.println("c1.addNew(c2) = " + sumAddNew);
        System.out.println("Sau khi gọi addNew(), c1 = " + c1); // c1 vẫn là 3.0 + 4.0i

        // 3. addInto() - Thay đổi chính instance c1
        System.out.println("Giá trị c1 ban đầu: " + c1);
        c1.addInto(c2); // c1 = c1 + c2 = (3+1) + (4-2)i = 4.0 + 2.0i
        System.out.println("Sau khi gọi c1.addInto(c2), c1 = " + c1);
    }
}