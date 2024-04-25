package org.epamTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTestCasesWithMoreThanTenArguments {

    private final int[] input;
//    private final int[] expected;

    public ParameterizedTestCasesWithMoreThanTenArguments(int[] input) {
        this.input = input;
//        this.expected = expected;
    }

    private App app = new App();


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{4, 1, 3, 12, 13, 131, 131, 12, 53, 1,234 ,1 ,3 }},
                {new int[]{10, 9, 1, 23, 1, 13,436, 1, 7, 87, 345, 12, 111, 26}},
                {new int[]{1, 1, 1,1,1,1,1,1,1,1,1,1,1,1}},
                {new int[]{-20, 1, 10, 113, -123, -123, -2, 56,1, 12,123, 46,123}}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanTenArgumentsCase(){

       app.sort(input);
    }



}
