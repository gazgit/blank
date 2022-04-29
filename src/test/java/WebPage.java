import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPage extends PageObject {

    private final String FIRST_NAME = "axel";
    private final String LAST_NAME = "Jones";
    private final String ADDRESS = "1 High Street";
    private final String USERNAME = "axelJ";
    private final String PASSWORD = "password";
    private final String STATE = "Wales";
    private final String CITY = "Cardiff";
    private final String ZIPCODE = "CF14 3UZ";
    private final String PHONE_NUMBER = "01234 5678900";
    private final String SSN = "01234";

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[1]/a")
    private WebElement forgotLoginLink;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    private WebElement registerLink;

    @FindBy(id = "customer.firstName")
    private WebElement customerFirstName;

    @FindBy(id = "firstName")
    private WebElement customerLookupFirstName;

    @FindBy(id = "customer.lastName")
    private WebElement customerLastName;

    @FindBy(id = "lastName")
    private WebElement customerLookupLastName;

    @FindBy(id = "customer.address.street")
    private WebElement customerAddress;

    @FindBy(id = "address.street")
    private WebElement customerLookupAddress;

    @FindBy(id = "customer.address.city")
    private WebElement customerCity;

    @FindBy(id = "address.city")
    private WebElement customerLookupCity;

    @FindBy(id = "customer.address.state")
    private WebElement customerState;

    @FindBy(id = "address.state")
    private WebElement customerLookupState;

    @FindBy(id = "customer.address.zipCode")
    private WebElement customerZipcode;

    @FindBy(id = "address.zipCode")
    private WebElement customerLookupZipcode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement customerPhonenumber;

    @FindBy(id = "customer.ssn")
    private WebElement customerSocialSecurityNumber;

    @FindBy(id = "ssn")
    private WebElement customerLookupSocialSecurityNumber;

    @FindBy(id = "customer.username")
    private WebElement registerCustomerUsername;

    @FindBy(id = "customer.password")
    private WebElement customerPassword;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")
    private WebElement loginInfoButton;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    private WebElement loginCustomerUsername;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[2]/input")
    private WebElement loginCustomerPassword;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[1]/a")
    private WebElement newAccountLink;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
    private WebElement fundsTransferLink;

    @FindBy(xpath = "//*[@id=\"toAccountId\"]/option[1]")
    private WebElement selectAccountOne;

    @FindBy(xpath = "//*[@id=\"toAccountId\"]/option[2]")
    private WebElement selectAccountTwo;

    @FindBy(id = "amount")
    private WebElement transferAmount;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")
    private WebElement transferButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/h1")
    private WebElement transferMessage;

    @FindBy(id = "toAccountId")
    private WebElement toAccount;

    @FindBy(id = "type")
    private WebElement accountSelection;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div/input")
    private WebElement newAccountButton;

    @FindBy(id = "newAccountId")
    private WebElement newAccountNumberLink;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[2]/a")
    private WebElement accountOverviewButton;

    @FindBy(xpath = "//*[@id=\"transactionTable\"]/tbody/tr/td[2]/a")
    private WebElement fundsTransferReceivedLink;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[2]/a")
    private WebElement accountsOverviewLink;

    @FindBy(xpath = "//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")
    private WebElement checkingAccountOverviewLink;

    @FindBy(xpath = "//*[@id=\"transactionTable\"]/tbody/tr/td[2]/a")
    private WebElement fundsTransferSentLink;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/table/tbody/tr[4]/td[2]")
    private WebElement debitTransaction;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/p[2]/b")
    private WebElement newAccountMessage;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    private WebElement successMessage;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p[1]")
    private WebElement customerLookupSuccessMessage;

    @FindBy(id="customer.firstName.errors")
    private WebElement firstNameErrorMessage;

    @FindBy(id="customer.lastName.errors")
    private WebElement lastNameErrorMessage;

    @FindBy(id="customer.address.street.errors")
    private WebElement addressErrorMessage;

    @FindBy(id="customer.address.city.errors")
    private WebElement cityErrorMessage;

    @FindBy(id="customer.address.state.errors")
    private WebElement stateErrorMessage;

    @FindBy(id="customer.address.zipCode.errors")
    private WebElement zipcodeErrorMessage;

    @FindBy(id="customer.ssn.errors")
    private WebElement socialSecurityErrorMessage;

    @FindBy(id="customer.username.errors")
    private WebElement usernameErrorMessage;

    @FindBy(id="customer.password.errors")
    private WebElement passwordErrorMessage;

    @FindBy(id="repeatedPassword.errors")
    private WebElement passwordConfirmationErrorMessage;

    @FindBy(xpath="//*[@id=\"balance\"]")
    private WebElement balanceSummary;

    @FindBy(xpath="//*[@id=\"rightPanel\"]/table/tbody/tr[5]/td[2]")
    private WebElement transactionSummary;

    @FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[8]/a")
    private WebElement logOutButton;

    public WebPage(WebDriver driver) {
        super(driver);
    }

    public void forgotLoginLink(){
        this.forgotLoginLink.click();
    }

    public void registerLink() {
        this.registerLink.click();
    }

    public void enterCustomerFirstName() {
        this.customerFirstName.sendKeys(FIRST_NAME);
    }

    public void enterCustomerLookupFirstName() {
        this.customerLookupFirstName.sendKeys(FIRST_NAME);
    }

    public void enterCustomerLastName() {
        this.customerLastName.sendKeys(LAST_NAME);
    }

    public void enterCustomerLookupLastName() {
        this.customerLookupLastName.sendKeys(LAST_NAME);
    }

    public void enterCustomerAddress() {
        this.customerAddress.sendKeys(ADDRESS);
    }

    public void enterCustomerLookupAddress() {
        this.customerLookupAddress.sendKeys(ADDRESS);
    }

    public void enterCustomerCity() {
        this.customerCity.sendKeys(CITY);
    }

    public void enterCustomerLookupCity() {
        this.customerLookupCity.sendKeys(CITY);
    }

    public void enterCustomerState() {
        this.customerState.sendKeys(STATE);
    }

    public void enterCustomerLookupState() {
        this.customerLookupState.sendKeys(STATE);
    }

    public void enterCustomerZipcode() {
        this.customerZipcode.sendKeys(ZIPCODE);
    }

    public void enterCustomerLookupZipcode() {
        this.customerLookupZipcode.sendKeys(ZIPCODE);
    }

    public void enterCustomerPhoneNumber() {
        this.customerPhonenumber.sendKeys(PHONE_NUMBER);
    }

    public void enterCustomerSocialSecurityNumber() {
        this.customerSocialSecurityNumber.sendKeys(SSN);
    }

    public void enterCustomerLookupSocialSecurityNumber() {
        this.customerLookupSocialSecurityNumber.sendKeys(SSN);
    }

    public void enterRegisterCustomerUsername() {
        this.registerCustomerUsername.sendKeys(USERNAME);
    }

    public void enterCustomerPassword() {
        this.customerPassword.sendKeys(PASSWORD);
    }

    public void confirmPassword() {
        this.confirmPassword.sendKeys(PASSWORD);
    }

    public void hitRegisterButton() {
        this.registerButton.click();
    }

    public void hitFindMyLoginInfoButton() {
        this.loginInfoButton.click();
    }

    public void hitLoginButton() {
        this.loginButton.click();
    }

    public void openNewAccount() {
        this.newAccountLink.click();
    }

    public void clickFundsTransferLink() {
        this.fundsTransferLink.click();
    }

    public void selectFirstAccount() {
        this.selectAccountOne.click();
    }

    public void selectSecondAccount() {
        this.selectAccountTwo.click();
    }

    public void enterTransferAmount() {
        this.transferAmount.sendKeys("10");
    }

    public void hitTransferButton() {
        this.transferButton.click();
    }

    public void transferMessage() {
        this.transferMessage.getText().equalsIgnoreCase("Transfer Complete!");
    }

    public void selectSavingsAccount() {
        this.accountSelection.sendKeys("SAVINGS");
    }

    public void openSavingsAccount() {
        this.newAccountButton.click();
    }

    public void selectNewAccountLink() {
        this.newAccountNumberLink.click();
    }

    public void hitAccountOverviewButton() {
        this.accountOverviewButton.click();
    }

    public void clickFundsTransferReceivedLink() {
        this.fundsTransferReceivedLink.click();
    }

    public void clickAccountsOverviewLink() {
        this.accountsOverviewLink.click();
    }

    public void clickCheckingAccountOverviewLink() {
        this.checkingAccountOverviewLink.click();
    }

    public void clickFundsTransferSentLink() {
        this.fundsTransferSentLink.click();
    }

    public boolean confirmDebitTransaction() {
        return debitTransaction.getText().equalsIgnoreCase("Debit");
    }

    public boolean accountBalanceSummary() {
        return balanceSummary.getText().equalsIgnoreCase("$100");
    }

    public boolean transactionDetailsSummary() {
        return transactionSummary.getText().equalsIgnoreCase("$100");
    }

    public boolean successMessage() {
        return successMessage.getText().equalsIgnoreCase("Your account was created successfully. "
                + "You are now logged in.");
    }

    public boolean customerLookupSuccessMessage() {
        return customerLookupSuccessMessage.getText().equalsIgnoreCase("Your login information "
                + "was located successfully. You are now logged in.");
    }

    public boolean accountOpenedMessage() {
        return newAccountMessage.getText().equalsIgnoreCase("Congratulations, your account is now open."
                + "You are now logged in.");
    }

    public boolean firstNameErrorMessage() {
        return firstNameErrorMessage.getText().equalsIgnoreCase("First name is required.");
    }

    public boolean lastNameErrorMessage() {
        return lastNameErrorMessage.getText().equalsIgnoreCase("Last name is required.");
    }

    public boolean addressErrorMessage() {
        return addressErrorMessage.getText().equalsIgnoreCase("Address is required.");
    }

    public boolean cityErrorMessage() {
        return cityErrorMessage.getText().equalsIgnoreCase("City is required.");
    }

    public boolean stateErrorMessage() {
        return stateErrorMessage.getText().equalsIgnoreCase("State is required.");
    }

    public boolean zipcodeErrorMessage() {
        return zipcodeErrorMessage.getText().equalsIgnoreCase("Zipcode is required.");
    }

    public boolean socialSecurityErrorMessage() {
        return socialSecurityErrorMessage.getText().equalsIgnoreCase("Social Security Number is required.");
    }

    public boolean usernameErrorMessage() {
        return usernameErrorMessage.getText().equalsIgnoreCase("Username is required.");
    }

    public boolean passwordErrorMessage() {
        return passwordErrorMessage.getText().equalsIgnoreCase("Password is required.");
    }

    public boolean passwordConfirmationErrorMessage() {
        return passwordConfirmationErrorMessage.getText().equalsIgnoreCase("Password confirmation is required.");
    }

    public void enterLoginCustomerUsername() {
        this.loginCustomerUsername.sendKeys(USERNAME);
    }

    public void enterLoginCustomerPassword() {
        this.loginCustomerPassword.sendKeys(PASSWORD);
    }

    public void userLogsOut() {
        this.logOutButton.click();
    }

}