package tutorial.web.radio;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Result;

@Result(name = "radio", path = "/radio/radio.jsp")
public class RadioAction {

	public String radio;

	@Execute(validator = false)
	public String execute() {
		radio = "3";
		return "radio";
	}

	@Execute(validator = false)
	public String submit() {
		return "radio";
	}
}