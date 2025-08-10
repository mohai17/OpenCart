package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegisterSuccessPage;
import pageObjects.Registration;
import testBase.BaseTest;

public class TS_001_Validate_the_working_of_registration_functionality extends BaseTest {


    @Test(priority = 1)
    public void TC_001_Registering_with_all_valid_data(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Maclin");
        registration.enterLastName("Islam");
        registration.enterEmail("maclin@gmail.com");
        registration.enterPassword("maclin");
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage regSuccess = new RegisterSuccessPage(driver);
        boolean actualResult = regSuccess.IsSuccessMsgDisplayed();

        Assert.assertTrue(actualResult);

    }

    @Test(priority = 2)
    public void TC_002_Registering_with_only_mandatory_fields(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Jaclin");
        registration.enterLastName("Islam");
        registration.enterEmail("jaclin@gmail.com");
        registration.enterPassword("jaclin");
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertTrue(actual_result);

    }

    @Test(priority = 3)
    public void TC_003_Registering_with_special_characters_in_first_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Baclin$%@");
        registration.enterLastName("Islam");
        registration.enterEmail("baclin@gmail.com");
        registration.enterPassword("baclin123");
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertTrue(actual_result);

    }


}
