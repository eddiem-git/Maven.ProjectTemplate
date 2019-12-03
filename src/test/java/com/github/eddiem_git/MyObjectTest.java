package com.github.eddiem_git;

import org.junit.Assert;
import org.junit.Test;

public class MyObjectTest {
    /**
     * This method is built as a template-design for simple tests
     */
    @Test
    public void test() { // TODO
        // given
        MyObject myObject = new MyObject();

        // when
        myObject.run();


        //then
        Assert.assertNotNull(myObject.toString());
    }
}
