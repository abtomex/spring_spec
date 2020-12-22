package laba02.figures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("circle")
public class Circle implements IFigure {


    private Coords centreCoords;
    @Value("#{ (T(java.lang.Math).sqrt((circle.centreCoords.xCoordinate * circle.centreCoords.xCoordinate) + (circle.centreCoords.yCoordinate * circle.centreCoords.yCoordinate))) }")
    private int radius;

    public void draw() {
        System.out.printf("Рисуем окружность в x=%d, y=%d, радиусом=%d\n", centreCoords.getxCoordinate(), centreCoords.getyCoordinate(), getRadius());
    }

    private int random(){
        return (int)(Math.random() * 100);
    }

    @Autowired
    public Circle(Coords centreCoords) {
        this.centreCoords = centreCoords;
    }

    public Coords getCentreCoords() {
        return centreCoords;
    }

    public void setCentreCoords(Coords centreCoords) {
        this.centreCoords = centreCoords;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + centreCoords.getxCoordinate() +
                ", yCoordinate=" + centreCoords.getyCoordinate() +
                ", radius=" + radius +
                '}';
    }
}
