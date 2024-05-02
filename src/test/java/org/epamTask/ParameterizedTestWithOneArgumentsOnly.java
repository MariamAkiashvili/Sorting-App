package org.epamTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTestWithOneArgumentsOnly {

    private final int[] input;
    private final int[] expected;

    public ParameterizedTestWithOneArgumentsOnly(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    private App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{4}, new int[]{4}},
                {new int[]{10}, new int[]{10}},
                {new int[]{1}, new int[]{1}},
                {new int[]{-20}, new int[]{-20}}
        });
    }
    @Test
    public void testOneArgumentWithParameters(){
        Assert.assertArrayEquals(expected, app.sort(input));
    }
}
