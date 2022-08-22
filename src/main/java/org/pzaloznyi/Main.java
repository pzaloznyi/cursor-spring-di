package org.pzaloznyi;

import org.pzaloznyi.services.CalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        xmlInjectionDemo();
        annotationInjectionDemo();
        javaConfigInjectionDemo();
    }

    private static void xmlInjectionDemo() {
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("config.xml");
        var calculatorService = (CalculatorService) beanFactory.getBean("calculatorService");

        System.out.println(calculatorService.calculate(25, 10));
        System.out.println(calculatorService.calculate(9, 10));
    }

    private static void annotationInjectionDemo() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("org.pzaloznyi");
        var calculatorService = (CalculatorService) appContext.getBean("calculatorService");

        System.out.println(calculatorService.calculate(26, 10));
        System.out.println(calculatorService.calculate(1, 30));
    }

    private static void javaConfigInjectionDemo() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("org.pzaloznyi.config");
        var calculatorService = appContext.getBean(CalculatorService.class);

        System.out.println(calculatorService.calculate(1, 2));
        System.out.println(calculatorService.calculate(2, 1));
    }
}
