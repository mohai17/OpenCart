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

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 4)
    public void TC_004_Registering_with_numeric_values_in_first_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Maclin2");
        registration.enterLastName("Islam");
        registration.enterEmail("maclin2@gmail.com");
        registration.enterPassword("maclin2123");
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 5)
    public void TC_005_Registering_with_special_characters_in_last_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Faclin");
        registration.enterLastName("Islam$%@");
        registration.enterEmail("faclin2@gmail.com");
        registration.enterPassword("faclin123");
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 6)
    public void TC_006_Registering_with_numeric_values_in_last_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount();
        registration.clickOnRegisterLink();
        registration.enterFirstName("Raclin");
        registration.enterLastName("Islam2");
        registration.enterEmail("raclin@gmail.com");
        registration.enterPassword("raclin123");
        registration.clickOnSubscription();
        registration.clickOnPrivacyPolicy();
        registration.clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }




}
