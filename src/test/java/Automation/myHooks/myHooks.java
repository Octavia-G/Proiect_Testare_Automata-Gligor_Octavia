package Automation.myHooks;

import Automation.myUtils.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class myHooks {
    private TestBase test_Base;

    public myHooks(TestBase test_Base){
        this.test_Base = test_Base;
    }

    @Before
    public void initializareTest(){
        System.out.println("Hook BEFORE a inceput.");
        test_Base.initializDriver();
    }

    @After
    public void finalizareTest(){
        System.out.println("Hook AFTER a inceput");
        test_Base.inchideDriver();
    }

}


