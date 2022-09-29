package loginModule;

import org.testng.annotations.Test;

import GenericUtilities.Baseclass;
import GenericUtilities.ReadExcel;
import GenericUtilities.UtilityMethods;
import ObjectRepository.Loginpagefacebook;

public class TC01 extends Baseclass
{
	@Test(dataProvider="testdata",dataProviderClass=ReadExcel.class)
	
	public void entering_valid_credentials(String data,String data1)
	{
Loginpagefacebook login=new Loginpagefacebook(driver);
UtilityMethods utility=new UtilityMethods();

login.getEmailTextField().sendKeys(data);
login.getPasswordTextField().sendKeys(data1);

}
}