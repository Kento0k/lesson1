import knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Knight knight = ctx.getBean("knight", Knight.class);
        knight.embarkOnQuest();
        knight.getQuest().doQuest();
    }
}
