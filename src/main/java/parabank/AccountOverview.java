package parabank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class AccountOverview extends BrowserLaunch {

    public void accountoverview() throws InterruptedException {
        clickUsingXpath("//a[contains(text(),'Accounts Overview')]");
        clickUsingXpath("//a[contains(text(),'"+Utility.accountNumber+"')]");
        Thread.sleep(1000);
        String availableamount = driver.findElement(By.xpath("//td[@id=\"availableBalance\"]")).getText();
        System.out.println("Here is Available amount "+availableamount);
    }

    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}
