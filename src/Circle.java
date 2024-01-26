import java.awt.*;
public class Circle implements Area {
    private double radius;
    private Color fillcolor;
    private Color bordercolor;


    public Circle(double radius, Color fillcolor, Color bordercolor) {
        this.radius = radius;
        this.fillcolor = fillcolor;
        this.bordercolor = bordercolor;
    }

    public double getRadius() {
        return radius;
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

    public double getaSide() {
        throw new UnsupportedOperationException();
    };

    public double getbSide() {
        throw new UnsupportedOperationException();
    };

    public void rectanglePerimetr() {
        throw new UnsupportedOperationException();
    }

    public void rectangleArea() {
        throw new UnsupportedOperationException();
    }

    public Color getFillcolor() {
        return this.fillcolor;
    }

    public Color getBordercolor() {
        return this.bordercolor;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10,Color.green, Color.black);
        circle.circleArea();
        circle.circlePerimetr();
        circle.showBorderColor();
        circle.showFillColor();
    }
}
