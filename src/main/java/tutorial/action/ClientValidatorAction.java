package tutorial.action;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class ClientValidatorAction {

	@Required(target = "submit")
	public String aaa;

	@Required(target = "submit2")
	public String bbb;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = true, input = "index.jsp")
	public String submit() {
		return "index.jsp";
	}

	@Execute(validator = true, input = "index.jsp")
	public String submit2() {
		return "index.jsp";
	}
}