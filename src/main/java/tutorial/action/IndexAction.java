package tutorial.action;

import org.seasar.struts.annotation.Execute;

public class IndexAction {

	@Execute(validator = false)
	public String index() {
		return "http://www.seasar.org?redirect=true";
		// return "start.jsp";
	}
}