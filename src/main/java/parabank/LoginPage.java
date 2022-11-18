package parabank;

import org.openqa.selenium.By;

public class LoginPage extends BrowserLaunch {


    public void loginpage() {

        navigateUrl("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        sendKeys("username", "john");
        sendKeys("password", "demo");
        clickUsingXpath("//input[@value=\"Log In\"]");
    }

    private void navigateUrl(String url) {
        driver.get(url);
    }

    private void clickUsingXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    private void sendKeys(String id, String key) {
        driver.findElement(By.name(id)).sendKeys(key);
    }
}
