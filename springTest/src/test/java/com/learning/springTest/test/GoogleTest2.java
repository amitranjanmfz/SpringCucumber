package com.learning.springTest.test;

import com.learning.springTest.SpringBaseTestNGTest;
import com.learning.springTest.page.GooglePage;
import com.learning.springTest.util.ScreenShotUtil;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest2 extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("SpringBoot");
        this.screenShotUtil.takeScreenShot();
    }


}
