package com.guessinggame.service.guess;

import org.springframework.stereotype.Component;

@Component
public class GuessLogic implements GuessService {

    @Override
    public int guessGenerator() {
        return (int) ((Math.random() * (100 - 0) + 0));
    }
}
