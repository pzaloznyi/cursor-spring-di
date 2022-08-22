package org.pzaloznyi.services;

public class CalculatorService {
    private PlusService plusService;
    private MinusService minusService;

    public CalculatorService(PlusService plusService, MinusService minusService) {

        this.plusService = plusService;
        this.minusService = minusService;
    }

    public int calculate(int x, int y) {
        return x > y ? minusService.minus(x, y) : plusService.plus(x, y);
    }
}
