package tutorial.action;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Required;

public class AddAction {

	@Required
	@IntegerType
	public String arg1;

	@Required
	@IntegerType
	public String arg2;

	public Integer result;

	@Execute(validator = false)
	public String index() {
		return "index.jsp";
	}

	@Execute(input = "index.jsp")
	public String submit() {
		result = Integer.valueOf(arg1) + Integer.valueOf(arg2);
		return "index.jsp";
	}
}