package org.epamTask;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class ParameterizedTestCasesWithMoreThanTenArguments {

    private final String[] input;

    public ParameterizedTestCasesWithMoreThanTenArguments(String[] input) {
        this.input = input;
    }



    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"4", "1", "3", "12", "13", "131", "131", "12", "53", "1","234" ,"1" ,"3" }},
                {new String[]{"10", "9", "1", "23", "1", "13","436", "1", "7", "87", "345", "12", "111", "26"}},
                {new String[]{"1", "1", "1","1","1","1","1","1","1","1","1","1","1","1"}},
                {new String[]{"-20", "1", "10", "113", "-123", "-123", "-2", "56","1", "12","123", "46","123"}}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanTenArgumentsCase(){

       App.main(input);


    }



}
