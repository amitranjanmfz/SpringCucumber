package com.learning.springTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class Base {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct //want @FindBy Elements to be found at postconstruct
    private void initializeDriver(){
        PageFactory.initElements(this.driver,this);
    }

    @PreDestroy
    private void closeBrowser(){
        this.driver.quit();
    }

    public abstract boolean isAt();

}
