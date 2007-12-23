package tutorial.web.login;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/login/welcome.jsp")
public class WelcomeAction {

	public String userName;

	public String password;

	@Execute
	public String execute() {
		return "success";
	}
}