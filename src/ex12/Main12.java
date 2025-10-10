package ex12;

public class Main12 {
    public static void main(String[]args){
        Circle1 circle= new Circle1(1.1);
        Circle1 circle1=new Circle1();
        circle.setradius(2.2);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle);
        System.out.println("Bán kính là: " + circle.getradius());
        System.out.printf("Diện tích là: %.2f%n", circle.getarea());
        System.out.printf("Độ dài đường tròn là: %.2f%n", circle.getcircumference());
    }
}