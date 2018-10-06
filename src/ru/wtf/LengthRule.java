package ru.wtf;

public class LengthRule implements Rule{

    private int _MinLength;

    public LengthRule(int _MinLength) {
        this._MinLength = _MinLength;
    }

    public void setMinLength(int _MinLength) {
        this._MinLength = _MinLength;
    }

    @Override
    public boolean hasErrors(String password) {
        return password.length() >= _MinLength;
    }
}
