package laba02;

import laba02.figures.Circle;
import laba02.figures.Coords;
import laba02.figures.IFigure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("laba02.figures")
public class SpringGeometryApp {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringGeometryApp.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("context02.xml");

        IFigure circle = context.getBean("circle", IFigure.class);
        IFigure point = context.getBean("point", IFigure.class);

        circle.draw();
        point.draw();



    }
}
