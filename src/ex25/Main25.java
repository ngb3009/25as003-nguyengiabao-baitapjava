package ex25;

/**
 * Lớp Test Driver để kiểm tra các lớp Customer và Account.
 */
public class Main25 {
    public static void main(String[] args) {
        // --- 1. Kiểm tra Lớp Customer ---
        System.out.println("--- Kiểm tra Lớp Customer ---");
        Customer c1 = new Customer(101, "Tan Ah Teck", 'm');

        // Kiểm tra toString()
        System.out.println("Đã tạo khách hàng: " + c1);

        // Kiểm tra các getter
        System.out.println("ID: " + c1.getId());
        System.out.println("Tên: " + c1.getName());
        System.out.println("Giới tính: " + c1.getGender());
        System.out.println("---------------------------------");


        // --- 2. Kiểm tra Lớp Account ---
        System.out.println("\n--- Kiểm tra Lớp Account ---");

        // Kiểm tra constructor (với số dư)
        Account acc1 = new Account(201, c1, 1000.00);
        System.out.println("Tài khoản 1 (có số dư): " + acc1); // Kiểm tra toString()

        // Kiểm tra constructor (mặc định)
        Customer c2 = new Customer(102, "Jean Lim", 'f');
        Account acc2 = new Account(202, c2);
        System.out.println("Tài khoản 2 (mặc định): " + acc2);

        // Kiểm tra các getter
        System.out.println("ID Tài khoản 1: " + acc1.getId());
        System.out.println("Khách hàng (Tài khoản 1): " + acc1.getCustomer());
        System.out.println("Tên khách hàng (Tài khoản 1): " + acc1.getCustomerName());
        System.out.printf("Số dư (Tài khoản 1): %.2f\n", acc1.getBalance());

        // Kiểm tra setBalance()
        acc1.setBalance(1200.55);
        System.out.printf("Số dư mới (sau khi set): %.2f\n", acc1.getBalance());

        // Kiểm tra deposit()
        acc1.deposit(100.00);
        System.out.printf("Số dư sau khi nạp 100: %.2f\n", acc1.getBalance());

        // Kiểm tra withdraw() - Thành công
        acc1.withdraw(300.00);
        System.out.printf("Số dư sau khi rút 300 (thành công): %.2f\n", acc1.getBalance());

        // Kiểm tra withdraw() - Thất bại
        System.out.println("Thử rút 5000 từ Tài khoản 1...");
        acc1.withdraw(5000.00); // Sẽ in ra thông báo lỗi
        System.out.printf("Số dư sau khi rút (thất bại): %.2f\n", acc1.getBalance());

        // Kiểm tra method chaining (nối chuỗi phương thức)
        acc2.deposit(500).withdraw(100).deposit(200);
        System.out.printf("Số dư Tài khoản 2 (sau khi nối chuỗi 500-100+200): %.2f\n", acc2.getBalance());
        System.out.println("---------------------------------");
    }
}