package ex42;

public class Main42 {
    public static void main(String[] args) {

        Person p1 = new Person("Anh Tuan", "123 Duong ABC, Da Nang");
        System.out.println(p1);


        Student s1 = new Student("Bao Linh", "456 Duong XYZ, Quang Nam", 2023,  1500.0);
        System.out.println(s1);

        Staff st1 = new Staff("Chi Nguyen", "789 Duong QWE, Hue", "Truong DH Bach Khoa", 8000.0);
        System.out.println(st1);

        System.out.println("\n--- Cap nhat thong tin Staff ---");
        st1.setSchool("Truong DH Kinh Te");
        st1.setPay(9500.50);
        System.out.println("Truong moi: " + st1.getSchool());
        System.out.println("Luong moi: " + st1.getPay());
        System.out.println("Thong tin day du: " + st1);
    }
}