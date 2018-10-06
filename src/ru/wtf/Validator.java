package ru.wtf;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    List<Rule> rules = new ArrayList<>();

    public void registerRule(Rule rule) {
        rules.add(rule);
    }

    public boolean isValid(String pass) {
        for (Rule rule : rules) {
            if (rule.hasErrors(pass))
                return true;
        }
        return false;
    }
}
