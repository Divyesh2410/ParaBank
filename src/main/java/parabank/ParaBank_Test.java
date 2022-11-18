package parabank;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SuppressWarnings("DataProviderReturnType")
public class ParaBank_Test extends BrowserLaunch{
    WebDriver driver;
    private OpenNewAccount openNewAccount;
    private AccountOverview accountOverview;
    private TransferFund transferFund;
    private TransactionID transactionID;
    private FindTransaction findTransaction;

    @BeforeTest
    void setup() {
        driver = launchApp();
        openNewAccount = new OpenNewAccount();
        accountOverview = new AccountOverview();
        transferFund = new TransferFund();
        transactionID = new TransactionID();
        findTransaction = new FindTransaction();
    }

    @Test(priority = 1)
    void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginpage();
    }

    @Test(priority = 2)
    void opennewaccount() throws InterruptedException {
        openNewAccount.opennaccount();
    }

    @Test(priority = 3)
    void accountoverview() throws InterruptedException {
        accountOverview.accountoverview();
    }

    @Test(priority = 4)
    void transferfund() throws InterruptedException {
        transferFund.transferfund();
    }

    @Test(priority = 5)
    void transactionid() throws InterruptedException {
        transactionID.transactionid();
    }

    @Test(priority = 6)
    void findtransaction() throws InterruptedException {
        findTransaction.findtransaction();
    }
}
