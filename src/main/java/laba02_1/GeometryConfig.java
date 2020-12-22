package laba02_1;

import laba02_1.figures.Circle;
import laba02_1.figures.IFigure;
import laba02_1.figures.Point;
import laba02_1.figures.Scene;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeometryConfig {
    
    @Bean
    public Scene scene(@Value("red")String color, @Autowired @Qualifier("figures") List<IFigure> figures){
        return new Scene(color, figures);
    }
    
    @Bean
    public IFigure circle1(){
        return new Circle((int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100));
    }

    @Bean
    public IFigure Point(){
        return new Point((int)(Math.random() * 100), (int)(Math.random() * 100));
    }

    @Bean
    public IFigure circle2(){
        return new Circle((int)(Math.random() * 100), (int)(Math.random() * 100), (int)(Math.random() * 100));
    }


    @Bean
    public List<IFigure> figures(IFigure ... figs){
        return new ArrayList<>(Arrays.asList(figs));
    }
}
