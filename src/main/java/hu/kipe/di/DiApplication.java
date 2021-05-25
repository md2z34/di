package hu.kipe.di;

import hu.kipe.di.controllers.ConstructorInjectedController;
import hu.kipe.di.controllers.PropertyInjectedController;
import hu.kipe.di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DiApplication.class, args);

        System.out.println("--- property ---");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("--- setter ---");
        SetterInjectedController setterInjectedController = (SetterInjectedController)context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("--- constructor ---");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetings());
    }

}
