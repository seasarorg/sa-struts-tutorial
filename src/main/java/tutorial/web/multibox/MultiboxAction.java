package tutorial.web.multibox;

import java.util.Arrays;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/multibox/multibox.jsp")
public class MultiboxAction {

	public String[] checks;

	public String checksAsString;

	@Execute
	public String execute() {
		return "success";
	}

	@Execute
	public String submit() {
		checksAsString = Arrays.toString(checks);
		return "success";
	}

	public void reset() {
		checks = new String[0];
	}
}