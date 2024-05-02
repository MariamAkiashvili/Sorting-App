package org.epamTask;

import java.util.Arrays;

import org.apache.logging.log4j.*;
//import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public int []  sort(int[] args)
    {

        logger.info("Sorting started");

        if(args == null){
            logger.error("Input array is null");
            throw new IllegalArgumentException("Too many arguments");
        }
        if(args.length > 10){
            logger.warn("Input array length is more than 10 elements");
            throw new IllegalArgumentException("Too many arguments");
        }

        Arrays.sort(args);

        for (int arg : args) {
            System.out.println(arg);
        }

        logger.info("Sorting finished");
        return args;
    }
}
