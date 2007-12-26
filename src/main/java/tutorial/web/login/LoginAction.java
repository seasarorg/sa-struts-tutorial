package tutorial.web.login;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.Results;

@Results( { @Result(name = "login", path = "/login/login.jsp"),
	@Result(name = "welcome", path = "/login/welcome.jsp") })
public class LoginAction {

	@Required
	public String userName;

	@Required
	public String password;

	@Execute(validator = false)
	public String execute() {
		return "login";
	}

	@Execute(input = "login")
	public String login() {
		return "welcome";
	}
}