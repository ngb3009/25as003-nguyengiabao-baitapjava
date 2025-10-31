package ex24;

/**
 * Lớp Main24 để chạy chương trình.
 */
public class Main24 {
    public static void main(String[] args) {
        // 1. Tạo một đối tượng Customer
        Customer khachHang1 = new Customer(88, "An Nguyen", 10); // Giảm 10%
        System.out.println("Đã tạo khách hàng: " + khachHang1);

        // 2. Tạo một đối tượng Invoice cho khách hàng đó
        Invoice hoaDon1 = new Invoice(101, khachHang1, 2500.0);
        System.out.println("Đã tạo hóa đơn: " + hoaDon1);

        // 3. Kiểm tra các phương thức của Invoice
        System.out.println("------------------------------------");
        System.out.println("Thông tin từ hóa đơn:");
        System.out.println("ID Khách hàng: " + hoaDon1.getCustomerId());
        System.out.println("Tên Khách hàng: " + hoaDon1.getCustomerName());
        System.out.println("Mức giảm giá: " + hoaDon1.getCustomerDiscount() + "%");

        // 4. Kiểm tra phương thức tính giảm giá
        System.out.println("Số tiền gốc: " + hoaDon1.getAmount());
        System.out.printf("Số tiền sau khi giảm giá: %.2f\n", hoaDon1.getAmountAfterDiscount());

        // 5. Thử thay đổi giảm giá của khách hàng
        System.out.println("------------------------------------");
        khachHang1.setDiscount(25); // Tăng giảm giá lên 25%
        System.out.println("Đã cập nhật khách hàng: " + khachHang1);
        System.out.printf("Số tiền sau khi giảm giá (cập nhật): %.2f\n", hoaDon1.getAmountAfterDiscount());
    }
}