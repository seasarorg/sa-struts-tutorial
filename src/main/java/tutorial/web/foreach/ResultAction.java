package tutorial.web.foreach;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/foreach/result.jsp")
public class ResultAction {

	public String id;

	@Execute
	public String execute() {
		return "success";
	}
}