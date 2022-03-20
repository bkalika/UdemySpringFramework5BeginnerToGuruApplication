package guru.springframework;

import guru.springframework.controllers.*;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.services", "guru.springframework.controllers", "guru.springframework.examplebeans"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

//        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//        System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary Bean:");
		System.out.println(myController.sayHello());

        System.out.println("-------- Property:");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayGreeting());

        System.out.println("-------- Setter:");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor:");
        ConstructorInjectedController constructorInjectedController =
                (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        System.out.println("---------");
//        System.out.println(myController.sayHello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayGreeting());
//        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        // Lesson 6.2:
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());

        // FINISH Lesson 6.4.
	}

}
