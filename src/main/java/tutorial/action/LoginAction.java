package tutorial.action;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class LoginAction {

	@Required
	public String userName;

	@Required
	public String password;

	@Execute(validator = false)
	public String index() {
		return "login.jsp";
	}

	@Execute(validate = "validate", input = "login.jsp")
	public String login() {
		return "welcome.jsp";
	}

	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!userName.equals(password)) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"errors.invalid.login"));
		}
		return errors;
	}
}