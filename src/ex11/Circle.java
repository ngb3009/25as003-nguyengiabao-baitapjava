package ex11;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }

    public double getradius(){
        return radius;
    }

    public double getarea(){
        double area = radius*radius*Math.PI;
        return area;
    }
}
