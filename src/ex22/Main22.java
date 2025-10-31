package ex22;

public class Main22 {
    public static void main(String[] args) {
        // 1. Tạo các đối tượng Author
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        Author author2 = new Author("Jane Doe", "jane@example.com", 'f');
        Author author3 = new Author("Paul Tan", "paul@example.com", 'm');

        // 2. Tạo một mảng Author
        // Cách 1: Khai báo và khởi tạo riêng
        // Author[] authorsArray = new Author[2];
        // authorsArray[0] = author1;
        // authorsArray[1] = author2;

        // Cách 2: Khai báo và khởi tạo cùng lúc (ngắn gọn hơn)
        Author[] authorsArray = {author1, author2, author3};

        // 3. Tạo một đối tượng Book sử dụng mảng Author
        Book javaDummy = new Book("Java for Dummy", authorsArray, 29.99, 100);

        // 4. In thông tin sách sử dụng toString()
        // Kết quả mong đợi: "Book[name=Java for Dummy,authors={Author[...],Author[...],Author[...]},price=29.99,qty=100]"
        System.out.println(javaDummy.toString());
        System.out.println("-------------------------------------------------");

        // 5. In tên của các tác giả
        // Kết quả mong đợi: "Tan Ah Teck,Jane Doe,Paul Tan"
        System.out.println("Tên các tác giả: " + javaDummy.getAuthorNames());
        System.out.println("-------------------------------------------------");

        // 6. Truy cập trực tiếp mảng authors và thông tin tác giả
        System.out.println("Thông tin tác giả đầu tiên (từ mảng):");
        System.out.println("Tên: " + javaDummy.getAuthors()[0].getName());
        System.out.println("Email: " + javaDummy.getAuthors()[0].getEmail());
    }
}
