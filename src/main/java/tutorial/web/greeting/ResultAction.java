package tutorial.web.greeting;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Result;
import org.seasar.struts.annotation.Validwhen;

@Input(path = "/greeting/input.jsp")
@Result(path = "/greeting/result.jsp")
public class ResultAction {

	public String name;

	@Validwhen(test = "((name == null) or (*this* != null))", msg = @Msg(key = "errors.required.other"), args = @Arg(key = "name", resource = false, position = 1))
	public String name2;

	@Execute
	public String execute() {
		return "success";
	}
}