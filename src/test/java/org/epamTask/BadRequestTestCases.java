package org.epamTask;

import org.junit.Assert;
import org.junit.Test;


public class BadRequestTestCases{
    private App app = new App();

    @Test
    public void testEmptyCase()
    {
        int[] arr = new int[] {};
        Assert.assertArrayEquals(new int[]{},app.sort(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        app.sort(null);
    }


}
