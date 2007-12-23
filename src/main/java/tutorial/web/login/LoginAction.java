package tutorial.web.login;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/login/login.jsp")
public class LoginAction {

	@Execute
	public String execute() {
		return "success";
	}
}
