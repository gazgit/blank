import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestPlan {

    private static final WebDriver driver = new ChromeDriver();


    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Relevant error messages fire when mandatory registration fields are left blank.")
    public static void testAinvalidRegisterDetails() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        // User tries to register an account when all mandatory fields have been left blank.
        webPage.registerLink();
        webPage.hitRegisterButton();
        webPage.firstNameErrorMessage();
        webPage.lastNameErrorMessage();
        webPage.addressErrorMessage();
        webPage.cityErrorMessage();
        webPage.stateErrorMessage();
        webPage.zipcodeErrorMessage();
        webPage.socialSecurityErrorMessage();
        webPage.usernameErrorMessage();
        webPage.passwordErrorMessage();
        webPage.passwordConfirmationErrorMessage();
        System.out.println("Validation errors have fired for any mandatory registration fields left blank");
    }

    @Test(testName = "User successfully registers as a new user")
    public static void testBuserSignUp() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")));
        // User registers an account with valid data in all fields.
        webPage.registerLink();
        webPage.enterCustomerFirstName();
        webPage.enterCustomerLastName();
        webPage.enterCustomerAddress();
        webPage.enterCustomerCity();
        webPage.enterCustomerState();
        webPage.enterCustomerZipcode();
        webPage.enterCustomerPhoneNumber();
        webPage.enterCustomerSocialSecurityNumber();
        webPage.enterRegisterCustomerUsername();
        webPage.enterCustomerPassword();
        webPage.confirmPassword();
        webPage.hitRegisterButton();
        webPage.successMessage();
        Thread.sleep(2000);
        webPage.userLogsOut();
        System.out.println("User has successfully registered a new account");
    }

    @Test(testName = "User logs in, opens a new savings account and transfers $100 from the main account.")
    public static void testCnewSavingsAccount() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        // Waits until the element is clickable before attempting to click on it
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // User logs in with valid login details.
        webPage.enterLoginCustomerUsername();
        webPage.enterLoginCustomerPassword();
        webPage.hitLoginButton();
        // User creates a new SAVINGS account.
        webPage.openNewAccount();
        webPage.selectSavingsAccount();
        Thread.sleep(2000);
        webPage.openSavingsAccount();
        Thread.sleep(2000);
        webPage.accountOpenedMessage();
        // User opens the newly opened savings account to view transactions.
        webPage.selectNewAccountLink();
        // Balance is shown as $100.
        webPage.accountBalanceSummary();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"transactionTable\"]"
                + "/tbody/tr/td[2]/a")));
        webPage.clickFundsTransferReceivedLink();
        webPage.transactionDetailsSummary();
        //User opens their accounts overview.
        webPage.clickAccountsOverviewLink();
        Thread.sleep(2000);
        // User opens the CHECKING account overview page.
        webPage.clickCheckingAccountOverviewLink();
        Thread.sleep(2000);
        // User opens the funds transfer link.
        webPage.clickFundsTransferSentLink();
        Thread.sleep(2000);
        // Transaction shows $100 has been debited from the account.
        webPage.confirmDebitTransaction();
        Thread.sleep(2000);
        webPage.userLogsOut();
        System.out.println("User has successfully opened a new savings account and a balance of $100 has been transferred");
    }

    @Test(testName = "Transfer funds function")
    public static void testDfundsTransfer() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // User logs in with valid login details.
        webPage.enterLoginCustomerUsername();
        webPage.enterLoginCustomerPassword();
        webPage.hitLoginButton();
        // User opens the Funds Transfer link.
        webPage.clickFundsTransferLink();
        // User selects the CHECKING account.
        Thread.sleep(1000);
        webPage.selectFirstAccount();
        // User selects SAVINGS account.
        webPage.selectSecondAccount();
        // User adds a transfer amount to the transaction.
        webPage.enterTransferAmount();
        webPage.hitTransferButton();
        // Transfer is completed.
        webPage.transferMessage();
        webPage.userLogsOut();
        System.out.println("User has successfully transferred funds between two accounts");
    }

    @Test(testName = "Retrieve user details using the Forgot Login Info link")
    public static void testEforgotLoginInfo() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")));
        // User retrieves login details by entering the name and address of a user.
        webPage.forgotLoginLink();
        webPage.enterCustomerLookupFirstName();
        webPage.enterCustomerLookupLastName();
        webPage.enterCustomerLookupAddress();
        webPage.enterCustomerLookupCity();
        webPage.enterCustomerLookupState();
        webPage.enterCustomerLookupZipcode();
        webPage.enterCustomerLookupSocialSecurityNumber();
        webPage.hitFindMyLoginInfoButton();
        webPage.customerLookupSuccessMessage();
        System.out.println("User has successfully retrieved their login details and is now logged in");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}