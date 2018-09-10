package TestCases;

import logic.LogicalMethods;
import org.junit.Assert;
import org.junit.Test;

public class JUnitTest2 {

    @Test
    public void verifyAddition(){
        LogicalMethods logicalMethods=new LogicalMethods();
        Assert.assertTrue(logicalMethods.evenNum(4));
    }
}
