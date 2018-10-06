package ru.wtf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DictRule implements Rule {

    String path;

    public DictRule(String s) throws IOException {
        if (s.isEmpty())
            throw new IOException(":c");
        path = s;
    }

    @Override
    public boolean hasErrors(String password) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while (!(line = bufferedReader.readLine()).isEmpty()) {
                if (line.equals(password))
                    return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
