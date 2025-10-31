package ex31;

public class MyComplex {
    private double real=0.0;
    private double imag=0.0;

    public MyComplex() {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex(double real, double imag){
        this.real=0.0;
        this.imag=0.0;
    }

    public double getReal(){
        return this.real;
    }

    public void setReal(double real){
        this.real=real;
    }

    public double getImag(){
        return this.imag;
    }

    public void setImag(double imag){
        this.imag=imag;
    }

    public void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    public String toString() {
        if (imag < 0) {
            return real + "" + imag + "i";
        }
        return real + "+" + imag + "i";
    }

    public boolean isReal(){
        return (this.imag==0);
    }

    public boolean isImaginary(){
        return (this.real==0);
    }

    public boolean equals(double real, double imag){
        return (this.real==real)&&(this.imag==imag);
    }

    public boolean equals(MyComplex another){
        return (this.real==another.real)&&(this.imag==another.imag);
    }

    public double magnitude (){
        return Math.sqrt(real*real+imag*imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}
