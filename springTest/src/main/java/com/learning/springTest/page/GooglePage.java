package com.learning.springTest.page;

import com.learning.springTest.util.ScreenShotUtil;
import cucumber.api.java.cs.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {


    @Value("${application.url}")
    private String url;


    @Autowired
    private SearchComponent searchComponent;


    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public void goTo(){
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
