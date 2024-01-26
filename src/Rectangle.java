import java.awt.*;

public class Rectangle implements Area {
    private double aside;
    private double bside;
    private Color fillcolor;
    private Color bordercolor;

    public Rectangle(double aside, double bside, Color fillcolor, Color bordercolor) {
        this.aside = aside;
        this.bside = bside;
        this.fillcolor = fillcolor;
        this.bordercolor = bordercolor;
    }

    public double getaSide() {
        return aside;
    }

    public double getbSide() {
        return bside;
    }

    public Color getFillcolor() {
        return this.fillcolor;
    }

    public Color getBordercolor() {
        return this.bordercolor;
    }

    public double getRadius() {
        throw new UnsupportedOperationException();
    }

    public void circleArea() {
        throw new UnsupportedOperationException();
    }

    public void circlePerimetr() {
        throw new UnsupportedOperationException();
    }

    public double getAb() {
        throw new UnsupportedOperationException();
    }

    public double getBc() {
        throw new UnsupportedOperationException();
    }

    public double getAc() {
        throw new UnsupportedOperationException();
    }

    public double getH() {
        throw new UnsupportedOperationException();
    }

    public double getBase() {
        throw new UnsupportedOperationException();
    }

    public void trianglePerimetr() {
        throw new UnsupportedOperationException();
    }

    public void triangleArea() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,5, Color.orange, Color.blue);
        rectangle.rectanglePerimetr();
        rectangle.rectangleArea();
        rectangle.showBorderColor();
        rectangle.showFillColor();
    }
}
