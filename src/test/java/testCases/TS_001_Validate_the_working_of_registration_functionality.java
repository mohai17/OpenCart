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
        registration.clickOnMyAccount()
        .clickOnRegisterLink()
        .enterFirstName("Movlin")
        .enterLastName("Islam")
        .enterEmail("movlin@gmail.com")
        .enterPassword("user123")
        .clickOnSubscription()
        .clickOnPrivacyPolicy()
        .clickOnContinueButton();

        RegisterSuccessPage regSuccess = new RegisterSuccessPage(driver);
        boolean actualResult = regSuccess.IsSuccessMsgDisplayed();

        Assert.assertTrue(actualResult);

    }

    @Test(priority = 2)
    public void TC_002_Registering_with_only_mandatory_fields(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("Oaclin")
                .enterLastName("Islam")
                .enterEmail("Oaclin@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertTrue(actual_result);

    }

    @Test(priority = 3)
    public void TC_003_Registering_with_special_characters_in_first_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("Janli@#$")
                .enterLastName("Islam")
                .enterEmail("janli@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 4)
    public void TC_004_Registering_with_numeric_values_in_first_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("xaclin123")
                .enterLastName("Islam")
                .enterEmail("xaclin@gmail.com")
                .enterPassword("maclin")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 5)
    public void TC_005_Registering_with_special_characters_in_last_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("Lala")
                .enterLastName("Islam#$")
                .enterEmail("lala@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 6)
    public void TC_006_Registering_with_numeric_values_in_last_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("Aok")
                .enterLastName("Islam123")
                .enterEmail("aok@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        boolean actual_result = registerSuccessPage.IsSuccessMsgDisplayed();

        Assert.assertFalse(actual_result);

    }

    @Test(priority = 7)
    public void TC_007_Registering_with_an_invalid_email_format(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("abcd")
                .enterLastName("abcd")
                .enterEmail("maclin@gmail")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        boolean actual_result = registration.isEmailWarningDisplayed();

        Assert.assertTrue(actual_result);

    }

    @Test(priority = 8)
    public void TC_008_Registering_with_a_blank_first_name_field(){

        Registration registration = new Registration(driver);
        registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("")
                .enterLastName("Islam")
                .enterEmail("maclin@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton();

        boolean actual_result = registration.isFirstNameWarningDisplayed();

        Assert.assertTrue(actual_result);

    }

    @Test(priority = 9)
    public void TC_009_Registering_with_a_blank_last_name_field(){

        Registration registration = new Registration(driver);
        boolean actual_result = registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("Mohin")
                .enterLastName("")
                .enterEmail("mohin@gmail.com")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton()
                .isLastNameWarningDisplayed();

        Assert.assertTrue(actual_result);

    }

    @Test(priority = 10)
    public void TC_010_Registering_with_a_blank_email_field(){

        Registration registration = new Registration(driver);
        boolean actual_result = registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("abcd")
                .enterLastName("abcd")
                .enterEmail("")
                .enterPassword("user123")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton()
                .isEmailWarningDisplayed();

        Assert.assertTrue(actual_result);
    }

    @Test(priority = 11)
    public void TC_011_Register_with_a_password_of_less_than_6_digits(){

        Registration registration = new Registration(driver);

        boolean actual_result = registration.clickOnMyAccount()
                .clickOnRegisterLink()
                .enterFirstName("abcd")
                .enterLastName("abcd")
                .enterEmail("abcd@gmail.com")
                .enterPassword("abc12")
                .clickOnSubscription()
                .clickOnPrivacyPolicy()
                .clickOnContinueButton()
                .isPasswordWarnDisplayed();

        Assert.assertTrue(actual_result);

    }


}
