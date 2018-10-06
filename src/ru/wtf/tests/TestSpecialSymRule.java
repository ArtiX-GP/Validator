package ru.wtf.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.wtf.SpecialSymRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestSpecialSymRule {

    @Test
    void test() {
        List<Character> characters = Arrays.asList('!', '@', '?', '#', '$');
        SpecialSymRule specialSymRule = new SpecialSymRule(characters, 2);
        Assertions.assertTrue(specialSymRule.hasErrors("!dssd"));
        Assertions.assertFalse(specialSymRule.hasErrors("!d!ssd"));
    }

}
