public class Pria extends Osnowa {
    private double width;
    private double lenght;

    public Pria(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    double square(){
        double plo;
        plo=width*lenght;
        return plo;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
