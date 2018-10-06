package ru.wtf.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.wtf.CaseRule;
import ru.wtf.LengthRule;
import ru.wtf.Validator;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    @DisplayName("Simple test")
    void test() {
        Validator validator = new Validator();
        validator.registerRule(new LengthRule(5));
        validator.registerRule(new CaseRule(2, 2));
        Assertions.assertTrue(validator.isValid("aasVDsc"));
    }

}