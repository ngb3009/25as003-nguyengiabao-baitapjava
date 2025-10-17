package ex21;

public class TheBookAuthor {
    public static void main(String[] args) {
        Author a = new Author("Nguyen Gia Bao", "baong.25as@vku.udn.vn", 'm');
        System.out.println(a);

        Book b1 = new Book("Java cho người mới", a, 900000, 99);
        System.out.println(b1);

        System.out.println("Author's name: " + b1.getAuthor().getName());
        System.out.println("Author's email: " + b1.getAuthor().getEmail());
        System.out.println("Author's gender: " + b1.getAuthor().getGender());

        b1.getAuthor().setEmail("ngb3009@gmail.com");
        b1.setPrice(899000);
        b1.setQty(120);

        System.out.println("After updates:");
        System.out.println(b1);
    }
}
