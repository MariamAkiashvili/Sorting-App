package org.epamTask;

import java.util.Arrays;

public class App 
{
    public int []  sort(int[] args)
    {

        if(args == null){
            throw new IllegalArgumentException("Too many arguments");
        }
        if(args.length > 10){
            throw new IllegalArgumentException("Too many arguments");
        }

        Arrays.sort(args);

        for (int arg : args) {
            System.out.println(arg);
        }

        return args;
    }
}
