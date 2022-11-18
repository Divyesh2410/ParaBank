package parabank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class FindTransaction extends BrowserLaunch{

    public void findtransaction(){

        clickUsingXpath("//a[contains(text(),'Find Transactions')]");
        sendKeys("//input[@id=\"criteria.transactionId\"]",Utility2.transactionid);
        clickUsingXpath("(//button[contains(text(),'Find Transactions')])[1]");
    }
    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    private void sendKeys(String id, String key) {
        driver.findElement(By.xpath(id)).sendKeys(key);
    }
}
