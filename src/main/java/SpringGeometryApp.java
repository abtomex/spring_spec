import figures.IFigure;
import figures.Scene;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGeometryApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

/*
        IFigure point = context.getBean("point", IFigure.class);
        point.draw();
        System.out.println(point.toString());
        IFigure circle = context.getBean("circle", IFigure.class);
        circle.draw();
        System.out.println(circle.toString());
*/

        Scene scene = context.getBean("scene", Scene.class);
        scene.drawFigures();
    }
}
