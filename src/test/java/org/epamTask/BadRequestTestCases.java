package org.epamTask;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class BadRequestTestCases{

    @Test
    public void testEmptyCase()
    {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setOut(System.out);
        App.main(new String[] {});


        Assert.assertEquals("", outContent.toString());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){

        App.main(null);
    }


}
