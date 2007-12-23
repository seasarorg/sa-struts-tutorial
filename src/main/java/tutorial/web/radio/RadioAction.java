package tutorial.web.radio;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(path = "/radio/radio.jsp")
public class RadioAction {

	public String radio;

	@Execute
	public String execute() {
		radio = "3";
		return "success";
	}

	@Execute
	public String submit() {
		return "success";
	}
}