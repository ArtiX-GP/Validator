package ru.wtf.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.wtf.CaseRule;

public class TestCaseRule {

    @Test
    void test() {
        CaseRule caseRule = new CaseRule(2, 2);
        Assertions.assertTrue(caseRule.hasErrors("aaaaaaaaaaaaaa"));
        Assertions.assertTrue(caseRule.hasErrors("AAAAAAAAAAAa"));
        Assertions.assertFalse(caseRule.hasErrors("aAAAAAAAAAAAAAAAAAaaaaaaa"));
    }

}
