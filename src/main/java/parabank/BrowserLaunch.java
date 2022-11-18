package parabank;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserLaunch {

    public static WebDriver driver;

    //@BeforeTest
    public WebDriver launchApp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
//    @Test
//    public void loginpage() throws InterruptedException {
//        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
////        Thread.sleep(2000);
////        driver.findElement(By.name("username")).sendKeys("john");
//        System.out.println("Clicked on Login");
//    }
}
