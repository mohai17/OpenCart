package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterSuccessPage;
import pageObjects.Registration;
import testBase.BaseTest;

public class TS_001_Validate_the_working_of_registration_functionality extends BaseTest {


    @Test
    public void TC_001_Registering_with_all_valid_data(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName();
        registration.enterLastName();
        registration.enterEmail();
        registration.enterPassword();
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage regSuccess = new RegisterSuccessPage(driver);
        boolean actualResult = regSuccess.IsSuccessMsgDisplayed();

        Assert.assertTrue(actualResult);

    }

}
