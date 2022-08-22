package org.pzaloznyi.services;

import org.springframework.stereotype.Component;

@Component("calculatorService")
public class CalculatorService {
    private final PlusService plusService;
    private final MinusService minusService;

    public CalculatorService(PlusService plusService, MinusService minusService) {

        this.plusService = plusService;
        this.minusService = minusService;
    }

    public int calculate(int x, int y) {
        return x > y ? minusService.minus(x, y) : plusService.plus(x, y);
    }
}
