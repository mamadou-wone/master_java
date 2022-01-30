package review;

public class Point {
    private float x;
    private float y;
    private byte scalaire;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(float x, float y, byte scalaire) {
        this(x, y);
        this.scalaire = scalaire;
    }

    public Point(){
        this(0, 0);
    }

    public void translate(float x, float y){
  //      System.out.println("Current x: "+ this.getX()+ " x:: " + x);
        this.setX(this.getX() + (x));
        this.setY(this.getY() + (y));
     //   System.out.println("Current y: "+ this.getY() + " y:: " + y);
    }

    public void display(){
        System.out.println(
                "X: " + this.getX() + "\n" + "Y: " + this.getY()
        );
    }

    public boolean coicide(Point point){
        return point.getX() == this.getX() && point.getY() == this.getY();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public byte getScalaire() {
        return scalaire;
    }

    public void setScalaire(byte scalaire) {
        this.scalaire = scalaire;
    }
}
