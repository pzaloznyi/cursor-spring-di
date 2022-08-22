package org.pzaloznyi.services;

import org.springframework.stereotype.Component;

@Component("minusService")
public class MinusService {
    public int minus(int x, int y) {
        return x - y;
    }
}
