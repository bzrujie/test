package pro.webws.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
    public static void main(String[] args) {  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-client.xml");  
        IHelloWorld client = (IHelloWorld) ctx.getBean("client");  
        String result = client.sayHello("你好!");  
        System.out.println(result);  
    }  
}  
