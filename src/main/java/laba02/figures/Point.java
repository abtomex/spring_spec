package laba02.figures;

import org.springframework.stereotype.Component;

@Component
public class Point implements IFigure {

    Coords coords;

    public void draw() {
        System.out.printf("Рисуем точку в x=%d, y=%d\n", coords.getxCoordinate(), coords.getyCoordinate());
    }

    public Point(Coords coords) {
        this.coords = coords;
    }


    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCoordinate=" + coords.getxCoordinate() +
                ", yCoordinate=" + coords.getyCoordinate() +
                '}';
    }
}
