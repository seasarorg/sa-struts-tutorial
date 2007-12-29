package tutorial.web.login;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class LoginAction {

	@Required
	public String userName;

	@Required
	public String password;

	@Execute(validator = false)
	public String execute() {
		return "login.jsp";
	}

	@Execute(input = "login.jsp")
	public String login() {
		return "welcome.jsp";
	}
}