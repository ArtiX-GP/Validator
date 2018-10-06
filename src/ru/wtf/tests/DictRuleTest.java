package ru.wtf.tests;

import org.junit.jupiter.api.*;
import ru.wtf.DictRule;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DictRuleTest {
    File temp;

    @BeforeAll
    public void createFile() throws IOException {
        temp = File.createTempFile("dict", "txt");
        PrintWriter printWriter = new PrintWriter(temp);
        printWriter.println("qwerty");
        printWriter.close();
    }

    @Test
    public void test() {
        try {
            DictRule rule = new DictRule(temp.toString());
            Assertions.assertFalse(rule.hasErrors("qwerty"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFile() {
        Assertions.assertThrows(IOException.class, () -> {
            DictRule dictRule = new DictRule("");
        });
    }

    @AfterAll
    public void deleteFile() {
        temp.delete();
    }
}
