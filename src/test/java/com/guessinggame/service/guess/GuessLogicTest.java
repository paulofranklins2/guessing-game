package com.guessinggame.service.guess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuessLogicTest {

    @Autowired
    GuessService guessService;

    @Test
    public void testRandomGenerator() {
        int i = guessService.guessGenerator();
        System.out.println(i);
    }
}