package tutorial.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.seasar.struts.annotation.Execute;

public class LogoutAction {

	@Resource
	protected HttpSession session;

	@Execute(validator = false)
	public String index() {
		session.invalidate();
		return "index.jsp";
	}
}