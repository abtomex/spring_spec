package figures;

import java.util.List;

public class Scene {
    private String color;
    private List<IFigure> figures;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<IFigure> getFigures() {
        return figures;
    }

    public void setFigures(List<IFigure> figures) {
        this.figures = figures;
    }

    public Scene(String color, List<IFigure> figures) {
        this.color = color;
        this.figures = figures;
    }

    public Scene() {}

    public void drawFigures(){
        figures.forEach(IFigure::draw);
    }
}
