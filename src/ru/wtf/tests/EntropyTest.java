package ru.wtf.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.wtf.EntropyRule;

public class EntropyTest {

    @Test
    void test() {
        Assertions.assertTrue(EntropyRule.entropy("111111111") < 0.5);
        Assertions.assertTrue(EntropyRule.entropy("abcdefghi") > 0.5);
    }

    @Test
    void ruleTest() {
        EntropyRule rule = new EntropyRule(3);
        Assertions.assertFalse(rule.hasErrors("abcdefghi"));
        Assertions.assertTrue(rule.hasErrors("111111111"));
    }

}
