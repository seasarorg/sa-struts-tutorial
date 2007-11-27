package tutorial.web.aaa;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/aaa/bbb.jsp")
public class BbbAction {

	@Execute
	public String execute() {
		return "success";
	}
}
