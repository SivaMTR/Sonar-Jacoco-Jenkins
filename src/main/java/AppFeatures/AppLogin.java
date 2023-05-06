package AppFeatures;

public class AppLogin {
	public boolean login(String username, String password) {
		boolean login_status=false;
		if(username.equals("admin") && password.equals("admin"))
		{
			login_status=true;
		}
		else if(username.equals("admin") && password.equals("admin"))
        {
	        login_status=false;
        }
        return login_status;
	}

}
