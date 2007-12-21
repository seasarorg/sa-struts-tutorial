package tutorial.web.greeting;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.UrlType;

@Input(path = "/greeting/input.jsp")
@Result(path = "/greeting/result.jsp")
public class ResultAction {

	@UrlType
	public String name;

	@Execute
	public String execute() {
		return "success";
	}
}