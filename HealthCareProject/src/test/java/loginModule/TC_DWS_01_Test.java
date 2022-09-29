package loginModule;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.Baseclass;
import GenericUtilities.UtilityMethods;
import ObjectRepository.LoginPage;


public class TC_DWS_01_Test extends Baseclass{
	@Test
	public void validate_whether_user_login_with_valid_credentials() throws IOException {
		LoginPage login=new LoginPage(driver);
		Assert.assertEquals(true, false);
		login.getEmailTextField().sendKeys(UtilityMethods.ReadProperties("username"));
		login.getPasswordTextField().sendKeys(UtilityMethods.ReadProperties("password"));
		login.getLoginButton().click();
	}
}


