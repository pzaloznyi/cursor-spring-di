package org.pzaloznyi;

import org.pzaloznyi.services.CalculatorService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var beanFactory = new ClassPathXmlApplicationContext("config.xml");
        var calculatorService = (CalculatorService) beanFactory.getBean("calculatorService");

        System.out.println(calculatorService.calculate(25, 10));
        System.out.println(calculatorService.calculate(9, 10));
    }
}
