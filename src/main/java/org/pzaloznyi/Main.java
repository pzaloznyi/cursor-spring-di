package org.pzaloznyi;

import org.pzaloznyi.services.CalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var beanFactory = new ClassPathXmlApplicationContext("config.xml");
        var xmlConfigCalculatorService = (CalculatorService) beanFactory.getBean("calculatorService");

        System.out.println(xmlConfigCalculatorService.calculate(25, 10));
        System.out.println(xmlConfigCalculatorService.calculate(9, 10));

        var appContext = new AnnotationConfigApplicationContext("org.pzaloznyi");
        var calculator = (CalculatorService) appContext.getBean("calculatorService");

        System.out.println(calculator.calculate(26, 10));
        System.out.println(calculator.calculate(1, 38));
    }
}
