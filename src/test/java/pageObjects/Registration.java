package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Registration extends Base{
    public Registration(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@id='top']//i[@class='fa-solid fa-user']")
    WebElement myAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='input-newsletter']")
    WebElement subscribe;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyPolicy;

    @FindBy(xpath = "//button[@type=\"submit\" and text()=\"Continue\"]")
    WebElement continueButton;

    @FindBy(xpath = "//div[@id='error-email']") WebElement emailWarn;
    @FindBy(xpath = "//div[@id='error-firstname']") WebElement fnameWarn;
    @FindBy(xpath = "//div[@id='error-lastname']") WebElement lnameWarn;
    @FindBy(xpath = "//div[@id='error-password']") WebElement passWarn;

    Actions actions = new Actions(driver);

    public void clickOnMyAccount(){

        actions.click(myAccount).perform();

    }

    public void clickOnRegisterLink(){

        actions.click(register).perform();

    }

    public void enterFirstName(String fName){

        firstName.sendKeys(fName);

    }

    public void enterLastName(String lName){

        lastName.sendKeys(lName);

    }

    public void enterEmail(String mail){

        email.sendKeys(mail);

    }

    public void enterPassword(String pass){

        password.sendKeys(pass);

    }

    public void clickOnSubscription(){

        actions.click(subscribe).perform();

    }

    public void clickOnPrivacyPolicy(){

        actions.click(privacyPolicy).perform();

    }

    public void clickOnContinueButton(){

        actions.click(continueButton).perform();

    }

    public boolean isEmailWarningDisplayed(){

        wait.until(ExpectedConditions.visibilityOf(emailWarn));

        System.out.println(emailWarn.getText());

        return emailWarn.isDisplayed();
    }

    public boolean isFirstNameWarningDisplayed(){

        wait.until(ExpectedConditions.visibilityOf(fnameWarn));

        System.out.println(fnameWarn.getText());

        return fnameWarn.isDisplayed();
    }

    public boolean isLastNameWarningDisplayed(){

        wait.until(ExpectedConditions.visibilityOf(lnameWarn));

        System.out.println(lnameWarn.getText());

        return lnameWarn.isDisplayed();
    }

    public boolean isPasswordWarnDisplayed(){

        wait.until(ExpectedConditions.visibilityOf(passWarn));

        System.out.println(passWarn.getText());

        return passWarn.isDisplayed();

    }



}
