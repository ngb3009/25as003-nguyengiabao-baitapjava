package ex44;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
        super();
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public MovablePoint (float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint (float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float [] getSpeed (){
        return new float []{this.xSpeed, this.ySpeed};
    }

    public String toString (){
        return "("+super.getX()+","+super.getY()+"Speed=("+this.xSpeed+","+this.ySpeed+")";
    }

    public MovablePoint move(){
        setX(getX()+this.xSpeed);
        setY(getY()+this.ySpeed);
        return this;
    }
}
