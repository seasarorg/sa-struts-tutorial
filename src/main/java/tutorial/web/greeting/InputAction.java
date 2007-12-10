package tutorial.web.greeting;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/greeting/input.jsp")
public class InputAction {

	@Execute
	public String execute() {
		return "success";
	}
}
