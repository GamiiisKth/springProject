import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by joshuaPro on 2016-01-18.
 */
public class DrawingApp {

    public static void main (String [] args){

       // Triangle triangle = new Triangle();
        ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle=(Triangle)  factory.getBean("triangle");
        triangle.draw();

        Triangle2 triangle2=(Triangle2) factory.getBean("triangle2");
        triangle2.draw();

        Triangle3 triangle3=(Triangle3) factory.getBean("triangle3");
        triangle3.draw();
    }
}
