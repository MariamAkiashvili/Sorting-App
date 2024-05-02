package org.epamTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTestCases {

    private final String[] input;
    private final String expected;

    public ParameterizedTestCases(String[] input, String expected) {
        this.input = input;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"4", "1", "3"}, "1\r\n3\r\n4\r\n"},
                {new String[]{"10", "9", "1"}, "1\r\n9\r\n10\r\n"},
                {new String[]{"1", "1", "1"}, "1\r\n1\r\n1\r\n"},
                {new String[]{"-20", "1", "10"}, "-20\r\n1\r\n10\r\n"}
        });
    }
    @Test
    public void testWithParameters(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(input);

        System.setOut(System.out);

        Assert.assertEquals(expected, outContent.toString());
    }

}
