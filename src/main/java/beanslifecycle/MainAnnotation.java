package beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanslifecycle/BeanLifeCycleAnnotation.xml");
        BeansLifeCycleAnnotation beansLifeCycleAnnotation = applicationContext.getBean("beansLifeCycleAnnotation", BeansLifeCycleAnnotation.class);
        applicationContext.close();
    }
}
