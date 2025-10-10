package ex16;

public class Main16 {
    public static void main(String[] args) {
        Account a1 = new Account("AS003", "NguyenGiaBao", 999999999);
        System.out.println(a1);
        Account a2 = new Account("AS999", "KhongCoTen");
        System.out.println(a2);

        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transfer(a2, 99999999);
        System.out.println(a1);
        System.out.println(a2);
    }
}