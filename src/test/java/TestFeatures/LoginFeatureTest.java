package TestFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

import AppFeatures.AppLogin;
public class LoginFeatureTest {
	AppLogin apl = new AppLogin();
	
	@Test
	void login_test1() {
		boolean status=apl.login("admin", "admin");
		Assert.assertEquals(status, true);
	}
	

}
