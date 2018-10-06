package ru.wtf.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.wtf.LengthRule;

public class TestLengthRule {

    @Test
    public void checkLength() {
        LengthRule rule= new LengthRule(5);
        Assertions.assertFalse(rule.hasErrors("abs"));
        rule.setMinLength(2);
        Assertions.assertTrue(rule.hasErrors("abs"));
    }

}
