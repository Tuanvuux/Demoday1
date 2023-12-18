package beanslifecycle;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeansLifeCycleAnnotation {
    @PostConstruct
    public void init() throws Exception{
        System.out.println("init method is called");
    }
    @PreDestroy
    public void destroy() throws RuntimeException{
        System.out.println("destroy method is called");
    }
}
