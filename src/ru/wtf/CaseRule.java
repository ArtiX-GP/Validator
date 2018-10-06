package ru.wtf;

public class CaseRule implements Rule {

    private int _MinC, _MaxC;

    public CaseRule(int _MinC, int _MaxC) {
        this._MinC = _MinC;
        this._MaxC = _MaxC;
    }

    @Override
    public boolean hasErrors(String password) {
        int l = 0, u = 0;
        for (Character ch :
                password.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (Character.isUpperCase(ch)) {
                    u += 1;
                } else {
                    l += 1;
                }
            }
        }
        return !((l >= _MinC) && (u >= _MaxC));
    }
}
