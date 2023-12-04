public class Angular extends Kolovkvadra{
    private double angular;

    public Angular(double width, double lenght, double radius, double angular) {
        super(width, lenght, radius);
        this.angular = angular;
    }
    double square(){
        double plo;
        plo=Math.toRadians(angular)*Math.PI*Math.pow(getRadius(),2);
        return plo;
    }

    public double getAngular() {
        return angular;
    }

    public void setAngular(double angular) {
        this.angular = angular;
    }
}
