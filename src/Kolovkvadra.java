public class Kolovkvadra extends Pria{
    private double radius;

    public Kolovkvadra(double width, double lenght, double radius) {
        super(width, lenght);
        this.radius = radius;
    }
    double square(){
        double plovkova;
        plovkova=Math.PI*Math.pow(radius,2);
        return plovkova;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
