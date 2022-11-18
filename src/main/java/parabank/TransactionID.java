package parabank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class TransactionID extends BrowserLaunch {

    public void transactionid() throws InterruptedException {
        clickUsingXpath("//a[contains(text(),'Accounts Overview')]");
        clickUsingXpath("//a[contains(text(),'"+Utility.accountNumber+"')]");
        clickUsingXpath("//a[contains(text(),'Funds Transfer Sent')]");
        String transactionid = driver.findElement(By.xpath("(//td)[2]")).getText();
        Utility2.transactionid = transactionid;
        System.out.println("Here is your Tranasaction ID "+transactionid);
    }

    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}
