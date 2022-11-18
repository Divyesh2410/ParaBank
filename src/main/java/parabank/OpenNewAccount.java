package parabank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenNewAccount extends BrowserLaunch{

    public void opennaccount() throws InterruptedException {
        Thread.sleep(1000);
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open New Account')]")));
        clickUsingXpath("//a[contains(text(),'Open New Account')]");
        Thread.sleep(1000);
        clickUsingXpath("//input[@value=\"Open New Account\"]");
        Thread.sleep(1000);
        String accountNumber = driver.findElement(By.xpath("//a[@id=\"newAccountId\"]")).getText();
        Utility.accountNumber=accountNumber;
        System.out.println("Here is your Account Number "+accountNumber);
    }

    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}
