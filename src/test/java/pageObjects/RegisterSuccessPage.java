package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RegisterSuccessPage extends Base{
    public RegisterSuccessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='content']//h1[text()='Your Account Has Been Created!']")
    WebElement successMsg;

    @FindBy(xpath = "//a[@class='btn btn-primary' and text()='Continue']")
    WebElement continueButton;

    Actions actions = new Actions(driver);

    public boolean IsSuccessMsgDisplayed(){
        return successMsg.isDisplayed();
    }

    public void clickOnContinueButton(){

        actions.click(continueButton).perform();
    }


}
