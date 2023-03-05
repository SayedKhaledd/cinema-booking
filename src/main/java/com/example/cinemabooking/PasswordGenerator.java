package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PasswordGenerator {
    private final PasswordConfig.PasswordAlphabet alphabet;
    private static final Random random = new Random();

    public PasswordGenerator(@Autowired PasswordConfig.PasswordAlphabet alphabet) {
        this.alphabet = alphabet;
    }

    public String generate(int length) {
        StringBuilder result = new StringBuilder();
        String allCharacters = alphabet.getCharacters();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            result.append(allCharacters.charAt(index));
        }
        return result.toString();
    }
}
