import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPage extends PageObject {

    private final String PURCHASE_NAME = "John";
    private final String USERNAME = "JohnE";
    private final String PASSWORD = "password";
    private final String COUNTRY = "Wales";
    private final String CITY = "Cardiff";
    private final String CARD = "Visa";
    private final String MONTH = "June";
    private final String YEAR = "2026";

    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[4]")
    private WebElement monitorMenu;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[1]/div/a/img")
    private WebElement monitorsPage;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a")
    private WebElement nexusPhone;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
    private WebElement addToCartButton;

    @FindBy(xpath = "/html/body/nav/div/div/ul/li[4]/a")
    private WebElement showCart;

    @FindBy(xpath = "/html/body/div[6]/div/div[2]/button")
    private WebElement placeOrderButton;

    @FindBy(id = "login2")
    private WebElement logInLink;

    @FindBy(id = "signin2")
    private WebElement signUpLink;

    @FindBy(id = "sign-username")
    private WebElement signUpUsername;

    @FindBy(id = "sign-password")
    private WebElement signUpPassword;

    @FindBy(id = "loginusername")
    private WebElement loginusername;

    @FindBy(id = "loginpassword")
    private WebElement loginpassword;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    private WebElement signUpButton;

    @FindBy(id = "name")
    private WebElement purchaseName;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "card")
    private WebElement card;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[2]")
    private WebElement purchaseButton;

    @FindBy(xpath = "/html/body/div[10]/h2")
    private WebElement purchase;

    @FindBy(xpath = "//*[@id=\"nameofuser\"]")
    private WebElement nameOfUser;

    public WebPage(WebDriver driver) {
        super(driver);
    }

    public void selectSignUpLink() {
        this.signUpLink.click();
    }

    public void enterSignUpUsername() {
        this.signUpUsername.sendKeys(USERNAME);
    }

    public void enterSignUpPassword() {
        this.signUpPassword.sendKeys(PASSWORD);
    }

    public void enterLogInUsername() {
        this.loginusername.sendKeys(USERNAME);
    }

    public void enterLogInPassword() {
        this.loginpassword.sendKeys(PASSWORD);
    }

    public void pressSignUpButton() {
        this.signUpButton.click();
    }

    public void selectLogInLink() {
        this.logInLink.click();
    }

    public void pressLoginButton() {
        this.loginButton.click();
    }

    public void selectMonitorMenu() {
        this.monitorMenu.click();
    }

    public boolean monitorsPage() {
        return monitorsPage.getText().equalsIgnoreCase("Apple monitor 24");
    }

    public void selectNexusPhone() {
        this.nexusPhone.click();
    }

    public void pressAddToCart() {
        this.addToCartButton.click();
    }

    public void showCart() {
        this.showCart.click();
    }

    public void pressPlaceOrder() {
        this.placeOrderButton.click();
    }

    public void addName() {
        this.purchaseName.sendKeys(PURCHASE_NAME);
    }

    public void addCountry() {
        this.country.sendKeys(COUNTRY);
    }

    public void addCity() {
        this.city.sendKeys(CITY);
    }

    public void addCreditCard() {
        this.card.sendKeys(CARD);
    }

    public void addMonth() {
        this.month.sendKeys(MONTH);
    }

    public void addYear() {
        this.year.sendKeys(YEAR);
    }

    public void pressPurchaseButton() {
        this.purchaseButton.click();
    }

    public boolean purchaseMessage() {
        return purchase.getText().equalsIgnoreCase("Thank You For Your Purchase!");
    }

    public String displayUser() {
        return nameOfUser.getText();
    }

}

