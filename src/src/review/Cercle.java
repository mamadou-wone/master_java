package review;

public class Cercle {
    private Point center;
    private double ray;

    public Cercle(Point center, double ray) {
        this.center = center;
        this.ray = ray;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRay() {
        return ray;
    }

    public void setRay(double ray) {
        this.ray = ray;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.getRay(), 2);
    }

    public void display(){
        System.out.println(
                "This cercle is define by his center with coordonate: \n"+
                        "x: " + this.getCenter().getX() + "\n " + "y: " + this.getCenter().getY()+
                        " and his area A: " + this.getArea()
        );
    }

}
