package ru.wtf;

import java.util.HashMap;
import java.util.Map;

public class EntropyRule implements Rule {

    private float _Level;

    public EntropyRule(float _Level) {
        this._Level = _Level;
    }

    public static double entropy(String password) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : password.toCharArray()) {
            freq.put(ch, freq.containsKey(ch) ? freq.get(ch) + 1 : 1);
        }
        double e = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            double p = (double) entry.getValue() / password.length();
            e += p * log2(p);
        }
        return -e;
    }

    @Override
    public boolean hasErrors(String password) {
        return !(entropy(password) >= _Level);
    }

    private static double log2(double a) {
        return Math.log(a) / Math.log(2);
    }

}
