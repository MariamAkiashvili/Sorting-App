package org.epamTask;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args)
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


        int[] intArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                intArgs[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                logger.error("Invalid input provided");
                throw new IllegalArgumentException("Invalid input provided: " + args[i]);
            }
        }

        Arrays.sort(intArgs);

        for (int arg : intArgs) {
            System.out.println(String.valueOf(arg));
        }

        logger.info("Sorting finished");

    }
}
