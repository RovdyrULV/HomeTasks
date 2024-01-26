import java.awt.*;

public interface Area {
    final double  P = 3.14;
    double getRadius();
    double getAb();
    double getBc();
    double getAc();
    double getH();
    double getBase();
    double getaSide();
    double getbSide();
    Color getFillcolor();
    Color getBordercolor();

    default void showFillColor(){
        System.out.println(getFillcolor());
    }
    default void showBorderColor(){
        System.out.println(getBordercolor());
    }

    default void circleArea(){
        double sofacircle = P * (getRadius() * getRadius());
    System.out.println(sofacircle);
    }

    default void circlePerimetr(){
        double pcirle = 2 * P * getRadius();
        System.out.println(pcirle);
    }

    default void trianglePerimetr(){
        double ptriangle = getAb() + getBc() + getAc();
        System.out.println(ptriangle);
    }

    default void triangleArea(){
        double striangle = 0.5 * getBase() * getH();
        System.out.println(striangle);
    }

    default void rectangleArea(){
        double srectangle = getaSide() * getbSide();
        System.out.println(srectangle);
    }

    default void rectanglePerimetr(){
        double prectangle = (getaSide() + getbSide()) * 2;
        System.out.println(prectangle);
    }
}
