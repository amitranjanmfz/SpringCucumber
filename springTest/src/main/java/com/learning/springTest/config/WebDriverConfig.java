package com.learning.springTest.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class WebDriverConfig {


    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "chrome")
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().version("90.0.4430.24").setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().version("72").setup();
        return new FirefoxDriver();
    }


}
