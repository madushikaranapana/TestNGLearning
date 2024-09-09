package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {
    @Test
    public void oLevel(){
        System.out.println("O/L");
//        Assert.fail();
    }
    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("A/L");
    }
    @Test(dependsOnMethods = {"oLevel" , "aLevel"} , alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }
}

//If OL enable =false cant happen as others  depends on this
//Ol executed but, others not
// always run, if other previous not running