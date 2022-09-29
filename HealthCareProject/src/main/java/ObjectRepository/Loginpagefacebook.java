package ObjectRepository;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Loginpagefacebook {

		public Loginpagefacebook(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//@FindBy(linkText = "Log in")
		//private WebElement loginLink;
		
		@FindBy(id = "email")
		private WebElement EmailTextField;
		
		@FindBy(id = "pass")
		private WebElement passwordTextField;
		
		//public WebElement getLoginLink() {
			//return loginLink;
		//}

		public WebElement getEmailTextField() {
			return EmailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		//public WebElement getLoginButton() {
			//return LoginButton;
	//	}
		//@FindBy(id = "Password")
		//private WebElement PasswordTextField;
		
		//@FindBy(xpath = "//input[@value='Log in']")
	//	private WebElement LoginButton;
		
	}




