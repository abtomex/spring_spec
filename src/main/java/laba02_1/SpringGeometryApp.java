package laba02_1;

import laba02_1.figures.Scene;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGeometryApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GeometryConfig.class);

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
