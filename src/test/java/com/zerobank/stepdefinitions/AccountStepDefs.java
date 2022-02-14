package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountStepDefs {
 AccountSummaryPage asPage= new AccountSummaryPage();
    @Then("Account summary	page should	have to	following account types:")
    public void account_summary_page_should_have_to_following_account_types(List<String> expectedAccountTypes) {
        System.out.println("expectedAccountTypes = " + expectedAccountTypes);
        List<String> actualAccountTypes= BrowserUtils.getElementsText(asPage.accounts);

        System.out.println("actualAccountTypes = " + actualAccountTypes);

        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
    }


    @Then("Credit Account should have to following titles:")
    public void creditAccountShouldHaveToFollowingTitles(List<String> expectedTitles) {
        System.out.println("expectedTitles = " + expectedTitles);
        List<String> actualTitles=BrowserUtils.getElementsText(asPage.titles);

        System.out.println("actualTitles = " + actualTitles);

        Assert.assertEquals(expectedTitles,actualTitles);
    }
}
