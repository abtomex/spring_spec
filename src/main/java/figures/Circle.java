package figures;

public class Circle implements IFigure {

    private int xCoordinate;
    private int yCoordinate;
    private int radius;

    public void draw() {
        System.out.printf("Рисуем окружность в x=%d, y=%d, радиусом=%d\n", getxCoordinate(), getxCoordinate(), getRadius());
    }

    public Circle(int xCoordinate, int yCoordinate, int radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public Circle() {}

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
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
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                '}';
    }
}
