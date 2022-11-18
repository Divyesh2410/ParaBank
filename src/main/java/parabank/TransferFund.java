package parabank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class TransferFund extends BrowserLaunch{

    public void transferfund() throws InterruptedException {
        clickUsingXpath("//a[contains(text(),'Transfer Funds')]");
        Thread.sleep(1000);
        sendKeys("//input[@id=\"amount\"]","10");
        Thread.sleep(1000);
        clickUsingXpath("//select[@id=\"fromAccountId\"]");
        Thread.sleep(1000);
        clickUsingXpath("(//option[@value=\""+Utility.accountNumber+"\"])[1]");
        Thread.sleep(1000);
        clickUsingXpath("//input[@value=\"Transfer\"]");
        System.out.println("Amount Transfered");
    }

    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    private void sendKeys(String id, String key) {
        driver.findElement(By.xpath(id)).sendKeys(key);
    }
}
