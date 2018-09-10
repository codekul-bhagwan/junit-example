package TestCases;

import logic.LogicalMethods;
import org.junit.Assert;
import org.junit.Test;

public class JunitTest1 {

    @Test
    public void verifyAddition(){
        LogicalMethods logicalMethods=new LogicalMethods();
        Assert.assertEquals(10,logicalMethods.addition(5,5));
    }
}
