package org.pzaloznyi.services;

import org.springframework.stereotype.Component;

@Component("plusService")
public class PlusService {
    public int plus(int x, int y) {
        return x + y;
    }
}
