package tutorial.web.select;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/select/select.jsp")
public class SelectAction {

	public String select;

	@Execute
	public String execute() {
		select = "3";
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}
}