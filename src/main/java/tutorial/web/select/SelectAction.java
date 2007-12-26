package tutorial.web.select;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "select", path = "/select/select.jsp")
public class SelectAction {

	public String select;

	@Execute(validator = false)
	public String execute() {
		select = "3";
		return "select";
	}

	@Execute(validator = false)
	public String submit() {
		return "select";
	}
}