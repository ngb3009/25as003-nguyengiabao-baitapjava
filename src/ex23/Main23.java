package ex23;

public class Main23 {
    public static void main(String[] args) {
        // 1. Tạo một đối tượng Author
        Author author = new Author("Joshua Bloch", "joshua@example.com");

        // In thử thông tin author
        System.out.println("Thông tin tác giả:");
        System.out.println(author); // Tự động gọi author.toString()

        System.out.println("------------------------------------");

        // 2. Tạo một đối tượng Book sử dụng Author đã tạo
        // Dùng constructor (isbn, name, author, price, qty)
        Book book = new Book("978-0132350884", "Effective Java", author, 54.99, 150);

        // 3. In thông tin chi tiết của cuốn sách
        // Thao tác này sẽ tự động gọi phương thức book.toString()
        System.out.println("Thông tin sách ban đầu:");
        System.out.println(book);

        System.out.println("------------------------------------");

        // 4. Thử các phương thức getter/setter
        System.out.println("Đang cập nhật giá và số lượng...");
        book.setPrice(59.99);
        book.setQty(200);

        // 5. Thử các phương thức getter khác
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Tên sách: " + book.getName());
        System.out.println("Tên tác giả: " + book.getAuthorName());
        System.out.println("Email tác giả: " + book.getAuthor().getEmail());
        System.out.println("Giá mới: " + book.getPrice());
        System.out.println("Số lượng mới: " + book.getQty());

        System.out.println("------------------------------------");

        // 6. In lại thông tin sách sau khi cập nhật
        System.out.println("Thông tin sách sau khi cập nhật:");
        System.out.println(book);
    }
}
