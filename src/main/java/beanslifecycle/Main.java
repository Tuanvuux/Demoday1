package beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanslifecycle/BeansLifeCycle.xml");
        BeansLifeCycle beansLifeCycle = applicationContext.getBean("beanslifecycle", BeansLifeCycle.class);
        applicationContext.close();
    }
}
