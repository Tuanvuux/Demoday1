package javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojobeans.Account;
import pojobeans.AccountService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
        System.out.println("Before money transfer");
        System.out.println("Account1 balance :" +accountService.getAccount(1).getBalance() );
        System.out.println("Account2 balance :" +accountService.getAccount(2).getBalance() );
        accountService.transferMoney(1,2,5.0);
        System.out.println("===========================");
        System.out.println("After money transfer");
        System.out.println("Account1 balance :" +accountService.getAccount(1).getBalance() );
        System.out.println("Account2 balance :" +accountService.getAccount(2).getBalance() );

    }
}
