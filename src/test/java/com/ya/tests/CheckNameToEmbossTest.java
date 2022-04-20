package com.ya.tests;

import com.ya.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckNameToEmbossTest {

    private final String name;
    private final boolean expected;

    public CheckNameToEmbossTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][]{
                {"Неуспешныйтест ", false},
                {"Успешный тест", true},
                {" Неуспешныйтест", false},
                {"", false},
                {"Два  пробела", false},
                {"12", false},
                {"Двадцатььььь буковок", false},
        };
    }

    @Test
    public void checkNameToEmbossTest() {
        Account account = new Account(name);

        //Act
        boolean result = account.checkNameToEmboss();

        //Assert
        assertEquals(result, expected);
    }
}
