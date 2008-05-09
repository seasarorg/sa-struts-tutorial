package tutorial.action;

import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.Execute;

public class ProtectAction {

	public HttpServletRequest request;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false, roles = "tomcat")
	public String tomcat() {
		return "tomcat.jsp";
	}
}