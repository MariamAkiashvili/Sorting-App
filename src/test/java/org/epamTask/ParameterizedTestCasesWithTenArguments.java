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
public class ParameterizedTestCasesWithTenArguments {

    private final String[] input;
    private final String expected;

    public ParameterizedTestCasesWithTenArguments(String[] input, String expected) {
        this.input = input;
        this.expected = expected;
    }

//    private final App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"4", "1", "3", "12", "13", "12", "53", "1" ,"1" ,"3" }, "1\r\n1\r\n1\r\n3\r\n3\r\n4\r\n12\r\n12\r\n13\r\n53\r\n"},
                {new String[]{"10", "9", "1", "23", "1", "13", "1", "7", "12", "26"}, "1\r\n1\r\n1\r\n7\r\n9\r\n10\r\n12\r\n13\r\n23\r\n26\r\n"},
                {new String[]{"1", "1", "1","1","1","1","1","1","1","1"}, "1\r\n1\r\n1\r\n1\r\n1\r\n1\r\n1\r\n1\r\n1\r\n1\r\n"},
                {new String[]{"-20", "1", "10", "-123", "-123", "-2", "56","1", "12", "46"}, "-123\r\n-123\r\n-20\r\n-2\r\n1\r\n1\r\n10\r\n12\r\n46\r\n56\r\n"}
        });
    }

    @Test
    public void testMoreThanTenArgumentsCase(){

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        App.main(input);

        System.setOut(System.out);

       Assert.assertEquals(expected,outContent.toString());
    }



}
