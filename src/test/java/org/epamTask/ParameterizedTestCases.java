package org.epamTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTestCases {

    private final int[] input;
    private final int[] expected;

    public ParameterizedTestCases(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    private App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{4, 1, 3}, new int[]{1, 3, 4}},
                {new int[]{10, 9, 1}, new int[]{1, 9, 10}},
                {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
                {new int[]{-20, 1, 10}, new int[]{-20, 1, 10}}
        });
    }
    @Test
    public void testWithParameters(){
        Assert.assertArrayEquals(expected, app.sort(input));
    }

}
