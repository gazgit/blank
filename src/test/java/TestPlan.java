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

    @Test(testName = "User can navigate to monitors section")
    public static void navigateToMonitors() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"itemc\"]")));
        webPage.selectMonitorMenu();
        Thread.sleep(5000);
        webPage.monitorsPage();
        System.out.println("User has navigated to the Monitor Section");
    }

    //Please change the USERNAME on the WebPage to a new unused name before running this test.
    @Test(testName = "User signs up and logs in and is shown as being logged in")
    public static void userSingUp() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));
        webPage.selectSignUpLink();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-username")));
        webPage.enterSignUpUsername();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-password")));
        webPage.enterSignUpPassword();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")));
        webPage.pressSignUpButton();
        //waits for the sign up successful popup and then accepts it.
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
        webPage.selectLogInLink();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        webPage.enterLogInUsername();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("loginpassword")));
        webPage.enterLogInPassword();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")));
        webPage.pressLoginButton();
        webPage.displayUser();
        Thread.sleep(5000);
        System.out.println("User has signed up and is now logged in");
    }

    @Test(testName = "User can purchase a nexus 6 mobile phone ")
    public static void userPurchasesNexus() throws InterruptedException {
        driver.get(Utils.BASE_URL);
        driver.manage().window().maximize();
        WebPage webPage = new WebPage(driver);
        //Waits until the element is clickable before attempting to click on it
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")));
        webPage.selectNexusPhone();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));
        webPage.pressAddToCart();
        //Waits for the product added pop up to appear and then accepts it.
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")));
        webPage.showCart();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")));
        webPage.pressPlaceOrder();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
        webPage.addName();
        webPage.addCountry();
        webPage.addCity();
        webPage.addCreditCard();
        webPage.addMonth();
        webPage.addYear();
        webPage.pressPurchaseButton();
        webPage.purchaseMessage();
        System.out.println("User has successfully purchased a Nexus 6 mobile phone");
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
