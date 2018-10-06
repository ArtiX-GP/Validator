package ru.wtf;

import java.util.List;

public class SpecialSymRule implements Rule {

    private List<Character> characters;
    private int m;

    public SpecialSymRule(List<Character> characters, int i) {
        this.characters = characters;
        this.m = i;
    }

    @Override
    public boolean hasErrors(String password) {
        int c = 0;
        for (char ch : password.toCharArray()) {
            c += characters.contains(ch) ? 1 : 0;
        }
        return !(c >= m);
    }
}
