package org.pzaloznyi.config;

import org.pzaloznyi.services.CalculatorService;
import org.pzaloznyi.services.MinusService;
import org.pzaloznyi.services.PlusService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public MinusService minusService() {
        return new MinusService();
    }

    @Bean
    public CalculatorService calculator() {
        return new CalculatorService(plusService(), minusService());
    }
}
