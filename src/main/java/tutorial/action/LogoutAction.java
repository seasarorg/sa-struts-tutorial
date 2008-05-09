package tutorial.action;

import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.Execute;

public class LogoutAction {

	public HttpSession session;

	@Execute(validator = false)
	public String index() {
		session.invalidate();
		return "index.jsp";
	}
}