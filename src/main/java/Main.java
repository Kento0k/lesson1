import knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Knight knight1 = ctx.getBean("knight1", Knight.class);
        knight1.sayPhrase();
        knight1.embarkOnQuest();
        knight1.getQuest().doQuest();
    }
}
