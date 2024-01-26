import java.awt.*;

public class Triangle implements Area {
    private double ab;
    private double bc;
    private double ac;
    private double h;
    private double base;
    private Color fillcolor;
    private Color bordercolor;

    public Triangle(double ab, double bc, double ac, double h, double base, Color fillcolor, Color bordercolor) {
        this.ab = ab;
        this.bc = bc;
        this.ac = ac;
        this.h = h;
        this.base = base;
        this.fillcolor = fillcolor;
        this.bordercolor = bordercolor;
    }

    public double getAb() {
        return ab;
    }

    public double getBc() {
        return bc;
    }

    public double getAc() {
        return ac;
    }

    public double getH() {
        return h;
    }

    public double getBase() {
        return base;
    }

    public double getRadius() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Color getFillcolor() {
        return this.fillcolor;
    }

    @Override
    public Color getBordercolor() {
        return this.bordercolor;
    }

    public void circleArea() {
        throw new UnsupportedOperationException();
    }

    public void circlePerimetr() {
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

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2,2,2,Color.gray, Color.black);
        triangle.triangleArea();
        triangle.trianglePerimetr();
        triangle.showBorderColor();
        triangle.showFillColor();
    }
}
