package ex12;

public class Circle1 {
    private double radius;

    public Circle1(){
        this.radius=1.0;
    }

    public Circle1(double r){
        this.radius=r;
    }

    public double getradius(){
        return radius;
    }

    public void setradius(double radius){
        this.radius=radius;
    }

    public double getarea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getcircumference(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return"Circle{ radius"+radius+"}";
    }
}
