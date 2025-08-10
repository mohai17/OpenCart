package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

}
