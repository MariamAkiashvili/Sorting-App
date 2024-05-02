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
public class ParameterizedTestWithOneArgumentsOnly {

    private final String[] input;
    private final String expected;

    public ParameterizedTestWithOneArgumentsOnly(String[] input, String expected) {
        this.input = input;
        this.expected = expected;
    }

//    private App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"4"}, "4\r\n"},
                {new String[]{"10"}, "10\r\n"},
                {new String[]{"1"}, "1\r\n"},
                {new String[]{"-20"}, "-20\r\n"}
        });
    }
    @Test
    public void testOneArgumentWithParameters(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to be tested
        App.main(input);

        // Restore System.out
        System.setOut(System.out);
        Assert.assertEquals(expected, outContent.toString());
    }
}
