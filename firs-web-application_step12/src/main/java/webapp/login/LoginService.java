package webapp.login;

import java.lang.annotation.Retention;

public class LoginService {

	public boolean validateUser(String user, String password){
		
		if(user.equalsIgnoreCase("jacek") && password.equals("pppp")){
			return true;
		}
		return false;
  
	
	}
	}

 


 