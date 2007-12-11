package tutorial.web.greeting;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.Result;

@Input(path = "/greeting/input.jsp")
@Result(path = "/greeting/result.jsp")
public class ResultAction {

	public String name;

	@Execute(validate = "validate")
	public String execute() {
		return "success";
	}

	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		if (StringUtil.isEmpty(name)) {
			errors.add("name", new ActionMessage("errors.required", "名前"));
		}
		return errors;
	}
}
