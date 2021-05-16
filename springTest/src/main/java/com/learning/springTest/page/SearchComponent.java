package com.learning.springTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchComponent extends Base {

    @FindBy(name="q")
    private WebElement searchBox;


    @FindBy(name="btnK")
    private List<WebElement> searchBtns;

    public void search(final String keyword) {
        this.searchBox.sendKeys(keyword);
        this.searchBtns.stream().filter(e -> e.isDisplayed() && e.isEnabled()).findFirst().ifPresent(WebElement::click);
    }


    @Override
    public boolean isAt() {
       return  this.wait.until((d)->this.searchBox.isDisplayed());
    }

}
