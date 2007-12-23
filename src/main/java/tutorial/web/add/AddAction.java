package tutorial.web.add;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Input;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;
import org.seasar.struts.annotation.Result;

@Result(path = "/add/add.jsp")
@Input(path = "/add/add.jsp")
public class AddAction {

	@Required(target = "calculate")
	@IntegerType
	public String arg1;

	@Required(target = "calculate")
	@IntegerType
	public String arg2;

	public Integer result;

	@Execute
	public String execute() {
		return "success";
	}

	@Execute
	public String calculate() {
		result = Integer.valueOf(arg1) + Integer.valueOf(arg2);
		return "success";
	}
}