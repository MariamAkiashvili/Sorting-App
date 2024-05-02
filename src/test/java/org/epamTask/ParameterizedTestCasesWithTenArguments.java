package org.epamTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTestCasesWithTenArguments {

    private final int[] input;
    private final int[] expected;

    public ParameterizedTestCasesWithTenArguments(int[] input, int [] expected) {
        this.input = input;
        this.expected = expected;
    }

    private App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{4, 1, 3, 12, 13, 12, 53, 1 ,1 ,3 }, new int[]{1,1,1,3,3,4,12,12,13,53}},
                {new int[]{10, 9, 1, 23, 1, 13, 1, 7, 12, 26}, new int[] {1,1,1,7,9,10,12,13,23,26}},
                {new int[]{1, 1, 1,1,1,1,1,1,1,1}, new int[]{1, 1, 1,1,1,1,1,1,1,1}},
                {new int[]{-20, 1, 10, -123, -123, -2, 56,1, 12, 46}, new int[]{-123,-123,-20,-2,1,1,10,12,46,56}}
        });
    }

    @Test
    public void testMoreThanTenArgumentsCase(){

       Assert.assertArrayEquals(expected,app.sort(input));
    }



}
