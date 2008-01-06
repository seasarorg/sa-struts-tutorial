package tutorial.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.util.TokenProcessor;
import org.seasar.struts.annotation.Execute;

public class TokenAction {

	public String text;

	public HttpServletRequest request;

	@Execute(validator = false)
	public String index() {
		TokenProcessor.getInstance().saveToken(request);
		return "input.jsp";
	}

	@Execute(validator = false, validate = "validate", input = "input.jsp")
	public String submit() {
		return "result.jsp";
	}

	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (!TokenProcessor.getInstance().isTokenValid(request, true)) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(
				"errors.invalid",
				"Token"));
		}
		return errors;
	}
}