package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(tagName = "h2")
    public List<WebElement> accounts;

    @FindBy(xpath = "(//table)[3]//th")
    public List<WebElement> titles;
}
