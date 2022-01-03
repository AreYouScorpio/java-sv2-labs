package figure;

public class Triangle implements Area{
    double lengthOfSide;
    double height;

    public Triangle(double lengthOfSide, double height) {
        this.lengthOfSide = lengthOfSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return lengthOfSide*height/2;
    }
}
