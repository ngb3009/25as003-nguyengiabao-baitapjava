package ex46;

public class Main46 {

    public static void main(String[] args) {

        System.out.println("--- Khởi tạo và kiểm tra toString() ---");

        // Tạo đối tượng Cat
        Cat cat1 = new Cat("Garfield");
        System.out.println(cat1.toString()); // In ra: Cat[Mamal[Animal[name=Garfield]]]

        // Tạo đối tượng Dog
        Dog dog1 = new Dog("Goofy");
        System.out.println(dog1.toString()); // In ra: Dog[Mamal[Animal[name=Goofy]]]

        System.out.println("\n--- Kiểm tra phương thức greets() ---");

        // Gọi greets() của Cat
        cat1.greets(); // In ra: Meow

        // Gọi greets() (không tham số) của Dog
        dog1.greets(); // In ra: Woof

        System.out.println("\n--- Kiểm tra nạp chồng greets(Dog) ---");

        // Tạo thêm một đối tượng Dog
        Dog dog2 = new Dog("Pluto");

        // Gọi greets(Dog) (có tham số)
        dog1.greets(dog2); // In ra: Woooof
        dog2.greets(dog1); // In ra: Woooof

        System.out.println("\n--- Thử nghiệm tính đa hình ---");

        // Một biến kiểu Animal có thể tham chiếu đến một đối tượng Cat
        Animal a1 = new Cat("Tom");
        System.out.println(a1.toString()); // Vẫn gọi toString() của Cat

        // Một biến kiểu Mammal có thể tham chiếu đến một đối tượng Dog
        Mammal m1 = new Dog("Spike");
        System.out.println(m1.toString()); // Vẫn gọi toString() của Dog

        // Tuy nhiên, bạn không thể gọi phương thức của lớp con
        // m1.greets(); // Dòng này sẽ báo lỗi biên dịch
        // Vì biến m1 có kiểu là Mammal, mà Mammal không có phương thức greets().
    }
}
