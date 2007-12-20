package tutorial.web.greeting;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Result;

@Input(path = "/greeting/input.jsp")
@Result(path = "/greeting/result.jsp")
public class ResultAction {

	@Required
	@Mask(mask = "abc")
	public String name;

	@Execute
	public String execute() {
		return "success";
	}
}
